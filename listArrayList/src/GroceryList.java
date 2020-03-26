import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in grocery list");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void modifyGroceryList(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryList(position, newItem);
        }
    }

    public void removeItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
    }

    public void removeItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeItem(position);
        }
    }

    private int findItem(String searchItem) {
        // boolean exists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int pos = findItem(searchItem);
        if(pos >= 0) {
            return true;
        }
        return false;
    }
}
