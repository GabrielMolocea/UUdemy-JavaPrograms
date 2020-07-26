public class Carpet {
    private double cost;

    public double getCost() {
        if (cost < 0){
            return 0;
        }
        return cost;
    }

    public Carpet(double cost) {
        if (cost < 0 ){
            this.cost = 0;
        }
        this.cost = cost;
    }


}
