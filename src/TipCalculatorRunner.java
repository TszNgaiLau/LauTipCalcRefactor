import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();
        scan.nextLine();
        TipCalculator calc = new TipCalculator(people,tip);

        double cost = 0;

        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            scan.nextLine();
            if (cost != -1) {
                calc.addMeal(cost);
            }
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Total bill before tip: " + calc.getTotalBillBeforeTip());
        System.out.println("Total percentage: " + (int) calc.getTipPercentage());
        System.out.println("Total tip: " + calc.tipAmount());
        System.out.println("Total bill with tip: " + calc.totalBill());
        System.out.println("Per person cost before tip: " + calc.perPersonCostBeforeTip());
        System.out.println("Tip per person: " + calc.perPersonTipAmount());
        System.out.println("Total cost per person: " + calc.perPersonTotalCost());
        System.out.println("---------------------------------------------------");



    }
}
