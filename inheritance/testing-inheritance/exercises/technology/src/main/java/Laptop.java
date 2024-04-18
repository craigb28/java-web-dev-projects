import java.time.LocalDate;

public class Laptop extends Computer {
    boolean hasDiskDrive;
    public Laptop(String name, String manufacturer, double cost, boolean hasDiskDrive) {
        super(name, manufacturer, cost);
        this.hasDiskDrive = hasDiskDrive;
    }
public void YearsOwned (int yearPurchased){
    int currentYear = LocalDate.now().getYear();
    System.out.println("You have owned this computer for "+(currentYear-yearPurchased)+"years!");
}

}
