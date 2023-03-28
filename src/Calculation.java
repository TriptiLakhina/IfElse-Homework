import java.util.Objects;
import java.util.Scanner;

public class Calculation {

    // Creating object for Scanner class to take input
    Scanner scanner=new Scanner(System.in);



    public static void main(String[] args) {

       // creating class object to call non-static method to static area
        Calculation calculation=new Calculation();

        //calling the method calculate using class object
        calculation.calculate();
    }



    // No return type no parameters
    void calculate(){

        // message to user for what to enter
        System.out.println("Enter any 2 numbers in int & press enter after each number");

        //Storing variables using scanner object
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();


        // Writing next message for the user to input
        System.out.println("Now enter your symbol from + , - , * , /");

        //Storing variables for 2nd user input using scanner object
        String symbol=scanner.next();

        // Storing variables
        String add="+";
        String sub="-";
        String multiply="*";
        String divide="/";




        if(Objects.equals(symbol, add)){
            System.out.println("your answer is " + (number1+number2));
        } else if (symbol.equals(sub)) {
            System.out.println("your answer is " + (number1-number2));

        } else if (symbol.equals(multiply)) {
            System.out.println("your answer is " + (number1*number2));

        } else if (symbol.equals(divide)) {
            System.out.println("your answer is " + (number1/number2));

       }else {
            System.out.println("No answer - Invalid entry. Please check symbol input again");
        }


    }
}
