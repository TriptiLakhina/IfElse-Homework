import java.util.Scanner;

public class PositiveNegative {

       Scanner scanner=new Scanner(System.in);           // Creating object for Scanner class to take input


    public static void main(String[] args) {

        PositiveNegative positiveNegative=new PositiveNegative();       // creating class object to call non-static method to static area
        positiveNegative.numbercheck();                                 //calling the method using class object

    }


    // No return type no parameters
    void numbercheck(){
        System.out.println("Enter a number in int value");              // message to user for what to enter
        int mynum=scanner.nextInt();                                    //Storing variables using scanner object



        if (mynum>0){
            System.out.println(mynum + " is a positive number");

        } else if (mynum<0) {
            System.out.println(mynum + " is a negative number");

        }else {
            System.out.println("This number is zero");
        }


    }
}
