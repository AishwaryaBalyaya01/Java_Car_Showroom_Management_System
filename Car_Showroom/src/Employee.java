import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements Utility{
    private static int total_employees;
    private String employee_id;
    private int employee_age;
    private String employee_name;
    private String department;

    public static int getTotal_employees() {
        return total_employees;
    }

    @Override
    public void getDetails() {
        total_employees++;
        UUID uuid = UUID.randomUUID();
        this.employee_id = String.valueOf(uuid);

        System.out.println("=================================== *** ENTER EMPLOYEE DETAILS *** ===================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee Department: ");
        this.department = sc.nextLine();
        System.out.print("Enter Employee Name: ");
        this.employee_name = sc.nextLine();
        System.out.print("Enter Employee Age: ");
        this.employee_age = sc.nextInt();
    }

    @Override
    public String toString() {
        return "\nEmployee Id:      "+this.employee_id+"\nEmployee Name:      "+this.employee_name+"\nEmployee Age:    "+this.employee_age+"\nDepartment:     "+this.department+"\n";
    }
}
