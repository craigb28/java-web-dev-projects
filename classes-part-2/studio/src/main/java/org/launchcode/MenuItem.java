package org.launchcode;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    public final LocalDateTime dateAdded;
    private boolean isNew;


    public MenuItem(String n, double p, String d, String c, Boolean iN) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.dateAdded = LocalDateTime.now();
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public LocalDateTime getDate() {
        return dateAdded;
    }

    public void printMenuItemToString() {
        System.out.println("Name: " + name + "\n" + "Price: $" + price + "\n" + "Description: " + description + "\n" + "Category: " + category);
    }

}

