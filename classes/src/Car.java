public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {

        String validModel = model.toLowerCase();
        if(validModel.equals("boxter") || validModel.equals("civic")) {
            this.model = model;
        }
        else {
            this.model = "unknown";
        }

        this.model = model;

    }

    public String getModel() {
        return this.model;
    }




}
