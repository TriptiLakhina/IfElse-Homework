import java.util.Scanner;

public class FiveNumberAverage {

    // Creating object for Scanner class to take input
    Scanner scanner=new Scanner(System.in);




    public static void main(String[] args) {

        // creating class object to call non-static method to static area
        FiveNumberAverage fiveNumberAverage=new FiveNumberAverage();

        //calling the method using class object
        fiveNumberAverage.average();
    }



    // No return type no parameters
    void average(){

        // Acknowledge user for what to enter
        System.out.println("Enter 5 numbers pressing enter after each number.");

        //Storing variables using scanner object
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int e=scanner.nextInt();

        double average=((a+b+c+d+e)/5);

        System.out.println("average of these 5 numbers is " + average);
    }
}
