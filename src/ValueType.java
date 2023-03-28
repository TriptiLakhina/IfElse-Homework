import java.util.Scanner;

public class ValueType {

    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter any character to know if it is an alphabet, a number or a special character/symbol");

        char value = scanner.next().charAt(0);

        if ((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {

            System.out.println(value + " is an alphabet.");

        } else if (value >= '0' && value <= '9') {

            System.out.println(value + " is a number.");

        } else {

            System.out.println(value + " is a symbol.");
        }
    }
}
