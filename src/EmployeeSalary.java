import java.util.Scanner;

public class EmployeeSalary {

    // Creating object for Scanner class to take input
    Scanner scanner=new Scanner(System.in);



    public static void main(String[] args) {

        // creating class object to call non-static method to static area
        EmployeeSalary employeeSalary=new EmployeeSalary();

        //calling the method using class object
        employeeSalary.employeedata();

    }


    // No return type no parameters
    void employeedata(){

        // Writing message for the user for what to enter
        System.out.println("Please enter Employee id in int, employee name in string & basic salary in double. Please press enter after each input.");

        //Storing variables using scanner object
        int employeeid=scanner.nextInt();
        String emplyeename=scanner.next();
        double basicsalary=scanner.nextDouble();

        //Storing variables
        double hra=basicsalary * 10/100;
        double da=basicsalary * 8/100;
        double ta=basicsalary * 9/100;
        double pf=basicsalary * 20/100;
        double grosssalary=basicsalary+hra+da+ta-pf;

        // Writing print command for required output.
        System.out.println("HRA - " + hra);
        System.out.println("DA - " + da);
        System.out.println("TA - " + ta);
        System.out.println("PF - " + pf);
        System.out.println("Gross Salary - " + grosssalary);


    }
}
