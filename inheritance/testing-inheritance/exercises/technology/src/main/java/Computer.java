public class Computer {
    // properties
    String name;
    String manufacturer;
    double cost;

    // parent-class constructor
    public Computer(String name, String manufacturer, double cost) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    // parent-class methods
    public void MakeAndModelStatement() {
        System.out.println("This " + name + " is made by " + manufacturer + ".");
    }

    public void CostForMultiple(int quantity) {
        double costForMultiple = cost * quantity;
        System.out.println("The cost for " + quantity + " " + name + "s is " + costForMultiple + ".");
    }
}
