import java.util.Scanner;

public class ValueType {
    // Creating object for Scanner class to take input
    static Scanner scanner=new Scanner(System.in);


    public static void main(String[] args) {
        // message to user for what to enter
        System.out.println("Enter any character to know if it is an alphabet, a number or a special character/symbol");

        //Storing variables using scanner object
        char value = scanner.next().charAt(0);


        if ((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {

            System.out.println("This is an alphabet.");

        } else if (value >= '0' && value <= '9') {

            System.out.println("This is a number.");

        } else {

            System.out.println("This is a symbol.");
        }
    }
}
