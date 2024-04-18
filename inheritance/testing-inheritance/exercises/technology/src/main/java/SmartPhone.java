import java.time.LocalDate;

public class SmartPhone extends Computer {
    int memoryExpansion;

    public SmartPhone(String name, String manufacturer, double cost, int currentMemory, int maximumMemory) {
        super(name, manufacturer, cost);
        this.memoryExpansion = maximumMemory-currentMemory;
    }

    public void YearsOwned (int yearPurchased){
        int currentYear = LocalDate.now().getYear();
        System.out.println("You have owned this computer for "+(currentYear-yearPurchased)+"years!");
    }

}




/*

Work on these exercises within IntelliJ using the java-web-dev-projects project you already created.
Add a new package called technology to your exercises directory.

    Class design: Create a new class called Computer. Before you add any more code,
    know that you will need to add two additional classes: Laptop and SmartPhone.

Before you start coding anything inside these classes, diagram how the three classes are going to be related to each other.
Remember to add properties and methods to your diagram!

    For a parent class add 3 properties, 2 methods, and a constructor.

    For a child class add at least 1 additional property and 1 additional method.

    Class implementation: Implement your design and test it in a Program.java class.

    Try to add three JUnit tests per class!

    Abstract class design: Consider the group of classes that you designed.
    Suppose you had a web program that used these classes,
    and you needed to assign a unique ID to every object created from one of these classes within the application.
    Therefore, each such class should have an Id property, and no two objects created
    from any of the classes may have the same value for Id. Create an abstract class,
    AbstractEntity, that contains the behavior for assigning and accessing such a unique ID for each class that extends it.
    Add this class to your program above, and add AbstractEntity to the class hierarchy in the correct place.




 */