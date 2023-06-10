import java.util.Scanner;

public class Showroom implements Utility{
    private String name;
    private String address;
    private String manager_name;
    private static int total_cars;
    private static int total_employees;

    public Showroom(){
        System.out.println("=================================== *** ENTER SHOWROOM DETAILS *** ===================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Showroom name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Showroom address: ");
        this.address = sc.nextLine();
        System.out.print("Enter Manager name: ");
        this.manager_name = sc.nextLine();
    }

    @Override
    public void getDetails() {
//        System.out.println("Showroom Name: "+this.name);
//        System.out.println("Showroom Address: "+this.address);
//        System.out.println("Manager Name: "+this.manager_name);
//        System.out.println("Total Cars: "+this.total_cars);
//        System.out.println("Total Employees: "+this.total_employees);
    }

    @Override
    public void setDetails() {
        //System.out.println("=================================== *** ENTER SHOWROOM DETAILS *** ===================================");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Showroom name: ");
//        this.name = sc.nextLine();
//        System.out.print("Enter Showroom address: ");
//        this.address = sc.nextLine();
//        System.out.print("Enter Manager name: ");
//        this.manager_name = sc.nextLine();
    }

    @Override
    public String toString() {
        //getDetails();
        return "Showroom Details\nShowroom Name:      "+this.name+"\nShowroom Adress:    "+this.address+"\nManager Name:       "+this.manager_name;
    }
}
