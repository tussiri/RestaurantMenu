package restaurant;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class MenuItem {

    private String name;
    private String description;
    private Double price;
    private String category;
    private LocalDate dateAdded;
    private boolean isNew;

    //Initialize dateAdded to the current date
    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = dateAdded;
    }

    public void checkIfNewItem(){
        long daysBetween = ChronoUnit.DAYS.between(dateAdded, LocalDate.now());
        if (daysBetween>30){
            isNew = false;
        }else{
            isNew=true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void printMenuItem() {
        System.out.println(this.getName() + " $" + this.getPrice() + "\n" + this.getDescription());
        if (this.isNew == true) {
            System.out.println("**NEW ITEM**\n");
        }
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return getName().equals(menuItem.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), category, getDescription(), isNew);
    }
}
