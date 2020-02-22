public class Lambo extends Car {

    private int topSpeed;
    private boolean carbonFiber;
    private String direction;
    private int gear;


    public Lambo(String vType, int doors, int seats, String model, int year, String color, int topSpeed, boolean carbonFiber, String direction, int gear) {
        super(vType, doors, seats, 4, "fuel", model, year, color, "manual");
        this.topSpeed = topSpeed;
        this.carbonFiber = carbonFiber;
        this.direction = direction;
        this.gear = gear;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isCarbonFiber() {
        return carbonFiber;
    }

    public void setCarbonFiber(boolean carbonFiber) {
        this.carbonFiber = carbonFiber;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
