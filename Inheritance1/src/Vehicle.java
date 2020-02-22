public class Vehicle {

    private String vType;
    private int doors;
    private int seats;
    private int wheels;
    private String powerSource;

    public Vehicle (String vType, int doors, int seats, int wheels, String powerSource) {

        this.vType = vType;
        this.doors = doors;
        this.seats = seats;
        this.wheels = wheels;
        this.powerSource = powerSource;

    }

    public String getvType() {
        return vType;
    }

    public void setName(String vType) {
        this.vType = vType;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }
}
