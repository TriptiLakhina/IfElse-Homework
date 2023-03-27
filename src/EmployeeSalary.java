import java.util.Scanner;

public class EmployeeSalary {
    Scanner scanner=new Scanner(System.in);
    int employeeid;
    String employeename;
    double basicsalary;



    public static void main(String[] args) {
        EmployeeSalary employeeSalary=new EmployeeSalary();
        employeeSalary.employeedata();

    }



    void employeedata(){
        System.out.println("Please enter Employee id in int, employee name in string & basic salary in double. Please press enter after each input.");

        int employeeid=scanner.nextInt();
        String emplyeename=scanner.next();
        double basicsalary=scanner.nextDouble();

        double hra=basicsalary * 10/100;
        double da=basicsalary * 8/100;
        double ta=basicsalary * 9/100;
        double pf=basicsalary * 20/100;
        double grosssalary=basicsalary+hra+da+ta-pf;

        System.out.println("HRA - " + hra);
        System.out.println("DA - " + da);
        System.out.println("TA - " + ta);
        System.out.println("PF - " + pf);
        System.out.println("Gross Salary - " + grosssalary);


    }
}
