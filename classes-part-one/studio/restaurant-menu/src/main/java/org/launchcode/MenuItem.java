package org.launchcode;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean newItem;

    public MenuItem(String name, Double price, String description, String category, Boolean newItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Boolean getNewItem() {
        return newItem;
    }

    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }
}
