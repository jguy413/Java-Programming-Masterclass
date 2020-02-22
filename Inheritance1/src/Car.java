public class Car extends Vehicle {

    private String model;
    private int year;
    private String color;
    private String transmission;


    public Car (String vType, int doors, int seats, int wheels, String powerSource, String model, int year, String color, String transmission) {

        super("car", doors, seats, wheels, powerSource);
        this.model = model;
        this.year = year;
        this.color = color;
        this.transmission = transmission;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
