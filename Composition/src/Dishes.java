public class Dishes {

    private int dishWeight;
    private int dishQuantity;

    public Dishes(int dishWeight, int dishQuantity) {
        this.dishWeight = dishWeight;
        this.dishQuantity = dishQuantity;
    }

    public int totalWeight() {
        return getDishWeight() * getDishQuantity();
    }

    public int getDishWeight() {
        return this.dishWeight;
    }

    public int getDishQuantity() {
        return this.dishQuantity;
    }
}
