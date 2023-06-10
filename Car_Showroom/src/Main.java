import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void mainMenu(){
        System.out.println("=================================== *** WELCOME TO CAR SHOWROOM MANAGEMENT SYSTEM *** ===================================");
        System.out.println();
        System.out.println("=================================== *** ENTER YOUR CHOICE *** ===================================");
        System.out.println();
        System.out.println("1. Add Showroom \t\t\t\t 2. Add Car \t\t\t\t 3. Add Employee");
        System.out.println("4. Showroom Details \t\t\t 5. Car Details \t\t\t 6. Employee Details");
        System.out.println();
        System.out.println("=================================== *** ENTER 0 TO EXIT *** ===================================");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Showroom showrooms = new Showroom();
        Car[] cars = new Car[1];
        Employee[] employees = new Employee[1];
        int num;
        int choice = 10000;
        int showroomNumber;
        int carNumber;
        int employeeNumber;
        while(choice!=0){
            mainMenu();
            choice=in.nextInt();
            while(choice!=9 && choice!=0) {
                switch (choice){
                    case 1:
                        showrooms.getDetails();
                        System.out.println("4. View Showroom Details      2. Add car");
                        System.out.print("Enter your choice: ");
                        choice=in.nextInt();
                        break;
                    case 2:
                        System.out.print("How many Cars you want to Add in Showroom: ");
                        carNumber = in.nextInt();
                        Car[] cc = new Car[carNumber];
                        num=0;
                        while(num<carNumber && num>-1  && choice!=5){
                            cc[num]=new Car();
                            cc[num].getDetails();
                            //Car car_example = cc[num] ;
                            showrooms.addCarToList(cc[num]);
                            if(num<carNumber-1) System.out.println("2. Add Car");
                            System.out.println("5. View Car Details ");
                            System.out.println();
                            System.out.print("Enter your choice: ");
                            choice=in.nextInt();
                            if(choice==2) num++;
                            else num=-1;
                        }
                        cars = cc;
                        break;
                    case 3:
                        System.out.print("How many Employees you want to Add: ");
                        employeeNumber = in.nextInt();
                        Employee[] emp = new Employee[employeeNumber];
                        num=0;
                        while(num<employeeNumber && num>-1  && choice!=6){
                            emp[num]=new Employee();
                            emp[num].getDetails();
                            if(num<employeeNumber-1) System.out.println("\n3. Add Employee");
                            System.out.println("\n6. View Employee Details ");
                            System.out.println();
                            System.out.print("Enter your choice: ");
                            choice=in.nextInt();
                            if(choice==3) num++;
                            else num=-1;
                        }
                        employees = emp;
                        break;
                    case 4: {
                        System.out.println("Showroom Details: ");
                        System.out.println();
                        System.out.println(showrooms.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
                        System.out.println();
                        System.out.println("Cars List: "+showrooms.getCars());
                        System.out.println("7. Delete Car");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = in.nextInt();
                        break;
                    }
                    case 5:
                        System.out.println("Car Details: ");
                        System.out.println(Arrays.toString(cars).replaceAll("\\[","").replaceAll("\\]","")+"\nTotal Cars Added:    "+cars[0].getTotal_cars());
                        System.out.println();
                        System.out.println("7. Delete Car");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = in.nextInt();
                        break;
                    case 6:
                        System.out.println("Employee Details: ");
                        System.out.println(Arrays.toString(employees).replaceAll("\\[","").replaceAll("\\]","")+"\nTotal Employees Added:    "+employees[0].getTotal_employees());
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = in.nextInt();
                        break;
                    case 7:
                        System.out.println("Which Car you want to Delete: ");
                        String delete=in.next();
                        System.out.println("\nLet me Check!!");
                        for(Car car:cars){
                            if(delete.equals(car.getCar_name())) {
                                car.remove(delete);
                                break;
                            }
                        }
                        System.out.println("\n9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice=in.nextInt();
                    default: break;
                }
            }
        }
    }
}
