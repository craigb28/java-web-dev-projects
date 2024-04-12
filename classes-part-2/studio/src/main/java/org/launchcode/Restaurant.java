package org.launchcode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        // write your code here

        MenuItem pizza = new MenuItem("pizza", 20.00, "dough, cheese, and sauce", "main course", true);
        MenuItem chicken = new MenuItem("chicken", 20.00, "dough, cheese, and sauce", "main course", true);
        MenuItem steak = new MenuItem("steak", 20.00, "grilled and sauced", "appetizer", false);
        MenuItem brownies = new MenuItem("brownies", 20.00, "chocolate", "dessert", true);

        ArrayList<MenuItem> menuItemArrayList = new ArrayList<>();

       Date date;
        menuItemArrayList.add(pizza);

        Menu menu = new Menu(date, menuItemArrayList);
        System.out.println(menuItemArrayList);


//        pizza.printMenuItemToString();
    }
}
