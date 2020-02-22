public class Furniture {

    private String table;
    private int chairs;

    public Furniture(String table, int chairs) {
        this.table = table;
        this.chairs = chairs;
    }

    public void prepDinnerTable() {
        System.out.println("Pushing in " + getChairs() + " chairs and putting plates on the " + getTable() + " table.");
    }

    public String getTable() {
        return this.table;
    }

    public int getChairs() {
        return this.chairs;
    }
}
