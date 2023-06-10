import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Showroom implements Utility{
    private String name;
    private String address;
    private String manager_name;
    private static int total_cars;
    private static int total_employees;
    private List<Car> cars = new ArrayList<Car>();


    @Override
    public void getDetails() {
        System.out.println("=================================== *** ENTER SHOWROOM DETAILS *** ===================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Showroom name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Showroom address: ");
        this.address = sc.nextLine();
        System.out.print("Enter Manager name: ");
        this.manager_name = sc.nextLine();
    }

    public void addCarToList(Car car){
        cars.add(car);
    }

    public void remove(String c){
        cars.removeIf(p -> p.getCar_name().equals(name));
    }

    public List getCars(){
        return cars;
    }
    @Override
    public String toString() {
        return "Showroom Name:      "+this.name+"\nShowroom Adress:    "+this.address+"\nManager Name:       "+this.manager_name;
    }
}
