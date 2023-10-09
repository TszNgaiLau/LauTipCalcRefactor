public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int num, int tip) {
        numPeople = num;
        tipPercentage = tip;
        totalBillBeforeTip = 0.0;
    }
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        double totalTip = totalBillBeforeTip * (tipPercentage / 100.00);
        totalTip = Math.round(totalTip * 100.0) / 100.0;
        return totalTip;
    }

    public double totalBill() {
       double total = totalBillBeforeTip + tipAmount();
       total = Math.round(total * 100.0) / 100.0;
       return total;
    }

    public double perPersonCostBeforeTip() {
        double perPersonCost = totalBillBeforeTip / numPeople;
        perPersonCost = Math.round(perPersonCost * 100.0) / 100.0;
        return perPersonCost;
    }

    public double perPersonTipAmount() {
        double perPersonTip = tipAmount() / numPeople;
        perPersonTip = Math.round(perPersonTip * 100.0) / 100.0;
        return perPersonTip;
    }

    public double perPersonTotalCost() {
        double perPersonTotal = perPersonCostBeforeTip() + perPersonTipAmount();
        perPersonTotal = Math.round(perPersonTotal * 100.0) / 100.0;
        return  perPersonTotal;
    }

}
