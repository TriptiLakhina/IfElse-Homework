import java.util.Scanner;

public class ValueType {

    static Scanner scanner=new Scanner(System.in);          // Creating object for Scanner class to take input


    public static void main(String[] args) {
        System.out.println("Enter any character to know if it is an alphabet, a number or a special character/symbol");    // message to user for what to enter
        char value = scanner.next().charAt(0);                  //Storing variables using scanner object


        if ((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {

            System.out.println(value + " is an alphabet.");

        } else if (value >= '0' && value <= '9') {

            System.out.println(value + " is a number.");

        } else {

            System.out.println(value + " is a symbol.");
        }
    }
}
