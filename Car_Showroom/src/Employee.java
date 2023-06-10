import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements Utility{

    private static int total_employees;
    private String employee_id;
    private int employee_age;
    private String employee_name;
    private String department;

    @Override
    public void getDetails() {
        System.out.println("Employee Id: "+this.employee_id);
        System.out.println("Employee Name: "+this.employee_name);
        System.out.println("Employee Age: "+this.employee_age);
        System.out.println("Employee Department: "+this.department);
    }

    @Override
    public void setDetails() {
        total_employees++;
        UUID uuid = UUID.randomUUID();
        this.employee_id = uuid.toString();
        System.out.println("=================================== *** ENTER EMPLOYEE DETAILS *** ===================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        this.employee_name = sc.nextLine();
        System.out.println("Enter Employee Age: ");
        this.employee_age = sc.nextInt();
        System.out.println("Employee Department: ");
        this.department = sc.nextLine();
    }


}
