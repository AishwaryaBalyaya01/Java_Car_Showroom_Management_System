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
        Showroom[] showrooms = new Showroom[1];
        int num;
        int choice = 10000;
        int showroomNumber;
        int carNumber;
        int empNumber;
        int employeeNumber;
        while(choice!=0){
            mainMenu();
            choice=in.nextInt();
            if(choice<7) {
                switch (choice){
                    case 1:
                        System.out.print("How many Showrooms you want to Add: ");
                        Scanner sc = new Scanner(System.in);
                        showroomNumber = sc.nextInt();
                        Showroom[] soo = new Showroom[showroomNumber];
                        num=0;
                        while(num<showroomNumber && num>-1){
                            soo[num]=new Showroom();
                            if(num<showroomNumber-1) System.out.println("1. Add Showroom");
                            System.out.println("4. View Showroom Details ");
                            System.out.print("Enter your choice: ");
                            choice=sc.nextInt();
                            if(choice==1) num++;
                            else num=-1;
                        }
                        showrooms = soo;
//                    case 2:
//                        System.out.print("How many Cars you want to Add: ");
//                        Scanner car = new Scanner(System.in);
//                        carNumber = car.nextInt();
//                        num=0;
//                        while(num<carNumber && num>-1){
//                            Car[] cars = new Car[carNumber];
//                            cars[num].setDetails();
//                            System.out.println("2. Add Car");
//                            System.out.println("5. View Car Details ");
//                            System.out.print("Enter your choice: ");
//                            choice=car.nextInt();
//                            if(choice==2) num++;
//                            else num=-1;
//                        }
//                    case 3:
//                        System.out.print("How many Cars you want to Add: ");
//                        Scanner emp = new Scanner(System.in);
//                        empNumber = emp.nextInt();
//                        num=0;
//                        while(num<empNumber && num>-1){
//                            Employee[] employees = new Employee[empNumber];
//                            employees[num].setDetails();
//                            System.out.println("2. Add Car");
//                            System.out.println("5. View Car Details ");
//                            System.out.print("Enter your choice: ");
//                            choice=emp.nextInt();
//                            if(choice==2) num++;
//                            else num=-1;
//                        }
                    case 4:
                        System.out.println("Showroom Details: ");
                        System.out.println(Arrays.toString(showrooms).replaceAll("\\[","").replaceAll("\\]",""));
                }
            }
        }
    }
}
