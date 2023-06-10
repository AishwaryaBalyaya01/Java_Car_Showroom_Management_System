import java.util.Scanner;

public class Car extends Showroom implements Utility{
    private String car_name;
    private String car_type;
    private String fuel_type;
    private String color;
    private static int total_cars=0;

    public static int getTotal_cars() {
        return total_cars;
    }

    public String getCar_name() {
        return car_name;
    }

    @Override
    public void getDetails() {
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

    @Override
    public void remove(String c){
        super.remove(c);
        System.out.println("Deleted "+c+" from List");
    }

    @Override
    public String toString() {
        //getDetails();
        return "\nCar Name:      "+this.car_name+"\nCar type:      "+this.car_type+"\nCar Color:    "+this.color+"\nFuel Type:    "+this.fuel_type+"\n";
    }
}
