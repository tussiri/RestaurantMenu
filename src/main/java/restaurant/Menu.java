package restaurant;


import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {

    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    public void updatedMenu(){
        this.lastUpdated = LocalDate.now();
    }

    public void addMenuItem(MenuItem item) {
        if(menuItems.contains(item)){
            System.out.println("Dish already on menu.");
            return;
        }
        menuItems.add(item);
        item.setNew(true);
        updatedMenu();
    }

    public void removeItem(MenuItem item) {
        menuItems.remove(item);
        updatedMenu();
    }

    public void printMenu() {
        System.out.println("APPETIZERS");
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Appetizer")) {
                item.printMenuItem();
            }
        }
        System.out.println();
        System.out.println("MAIN COURSE");
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Main Course")) {
                item.printMenuItem();
            }
        }
        System.out.println("DESSERT");
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Dessert")) {
                item.printMenuItem();
            }
        }
    }
    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                '}';
    }
}