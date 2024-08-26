package GroceryListApp;
import java.util.ArrayList;

// Enum for Item Category
enum Category {
    FRUIT, VEGETABLE, DAIRY, MEAT
}

// Item Class
class Item {
    private final String name; // The name of the item
    private final Category category; // The category of the item

    // Constructor
    public Item(String name, Category category) { // When creating an object of this class, the user provides it a name and category for the item
        this.name = name;
        this.category = category;
    }

    // Getters - but no setters because we don't want to change the name or category of an item
    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
}

// GroceryList Class
class GroceryList {
    private ArrayList<Item> items; // Create an ArrayList of Item objects, the contents of this list can only be objects of the Item class

    // Constructor
    public GroceryList() {
        items = new ArrayList<>(); // Initialize the ArrayList
    }

    // Methods of the GroceryList class
    public void addItem(Item item) {
        items.add(item);
    }

    public int countItems() { // Calls the recursive method of the same name. We overload because it's easier to have the Index parameter so we can add it each time we recurse. Basically we need some way to pass a number into the countItems method but don't want to allow the user to pass a number.
        return countItems(0);
    }
    private int countItems(int index) { // Overloaded method, this is the recursive method. Private so the user cannot access it.
        if (index >= items.size()) {
            return 0; // Base case
        }
        return 1 + countItems(index + 1); // Count this item and recurse
    }

    // Same as above except we check if the item matches the category before counting it.
    public int countItems(Category category) {
        return countItems(category, 0);
    }

    private int countItems(Category category, int index) {
        if (index >= items.size()) {
            return 0; // Base case
        }
        int matchesCat = (items.get(index).getCategory() == category) ? 1 : 0;
        return matchesCat + countItems(category, index + 1); // Count this item if it matches and recurse
    }
}

// Main Class
public class GroceryListApp {
    public static void main(String[] args) { // Main method, no Main class. This is the entry point of the program
        GroceryList list = new GroceryList(); // Create a new GroceryList object

        // Each item we add must be its own object of the Item class
        list.addItem(new Item("Apple", Category.FRUIT));
        list.addItem(new Item("Carrot", Category.VEGETABLE));
        list.addItem(new Item("Milk", Category.DAIRY));
        list.addItem(new Item("Chicken", Category.MEAT));

        System.out.println("Total Items: " + list.countItems());
        System.out.println("Fruit Items: " + list.countItems(Category.FRUIT));
    }
}
