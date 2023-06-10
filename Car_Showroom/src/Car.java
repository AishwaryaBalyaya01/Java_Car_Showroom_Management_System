import java.util.Scanner;

public class Car extends Showroom implements Utility{
    private String car_name;
    private String car_type;
    private String fuel_type;
    private String color;
    private static int total_cars=0;

    @Override
    public void getDetails() {
        System.out.println("Car Name: "+this.car_name);
        System.out.println("Car Type: "+this.car_type);
        System.out.println("Car Color: "+this.color);
        System.out.println("Fuel Type: "+this.fuel_type);
        System.out.println("Total Cars: "+this.total_cars);
    }

    @Override
    public void setDetails() {
        total_cars++;
        System.out.println("=================================== *** ENTER CAR DETAILS *** ===================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car Name: ");
        this.car_name = sc.nextLine();
        System.out.println("Enter Car Type: ");
        this.car_type = sc.nextLine();
        System.out.println("Car Color: ");
        this.color = sc.nextLine();
        System.out.println("Fuel Type: ");
        this.fuel_type = sc.nextLine();
    }
}
