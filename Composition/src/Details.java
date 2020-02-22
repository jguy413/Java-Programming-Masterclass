public class Details {

    private String floor;
    private int windows;
    private int cabinetWidth;
    private int cabinetHeight;
    private Dishes dishes;

    public Details(String floor, int windows, int cabinetWidth, int cabinetHeight, Dishes dishes) {
        this.floor = floor;
        this.windows = windows;
        this.cabinetWidth = cabinetWidth;
        this.cabinetHeight = cabinetHeight;
        this.dishes = dishes;
    }

    public void dishesToCabinet() {
        int dishWeight = this.dishes.totalWeight();
        int cabinetSize = getCabinetDimensions();
        if(dishWeight > cabinetSize) {
            System.out.println("Not enough space for dishes...even though it doesn't make sense why!");
        }
        else {
            System.out.println("Dishes put away, nice and tidy.");
        }
    }

    public int getCabinetDimensions() {
        return getCabinetHeight() * getCabinetWidth();
    }

    public String getFloor() {
        return this.floor;
    }

    public int getWindows() {
        return this.windows;
    }

    public int getCabinetWidth() {
        return this.cabinetWidth;
    }

    public int getCabinetHeight() {
        return this.cabinetHeight;
    }

    public Dishes getDishes() {
        return this.dishes;
    }
}
