package CarpetCostCalculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        setCost(cost);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0)
            this.cost = cost;
    }
}
