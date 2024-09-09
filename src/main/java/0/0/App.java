package zomato;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.displayMenu();
    }

    public void displayMenu() {
        List<FoodItem> menu = getMenu();
        System.out.println("Welcome to Zomato!");
        for (FoodItem item : menu) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }

    public List<FoodItem> getMenu() {
        List<FoodItem> menu = new ArrayList<>();
        menu.add(new FoodItem("Pizza", 8.99));
        menu.add(new FoodItem("Burger", 5.49));
        menu.add(new FoodItem("Pasta", 7.99));
        return menu;
    }
}

class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
