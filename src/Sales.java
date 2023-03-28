import java.util.Scanner;

public class Sales {
    Scanner scanner=new Scanner(System.in);         // Creating object for Scanner class to take input




    public static void main(String[] args) {
        Sales sales=new Sales();                    // creating class object to call non-static method to static area
        sales.salescommission();                    // calling the method using class object

    }



    // No return type no parameters
    void salescommission() {
        System.out.println("Enter sales id in int");              // message to user for what to enter
        int salesid = scanner.nextInt();                          // Storing variables using scanner object

        System.out.println("Enter seller's name in string");      // message 2 to user for what to enter
        String sellersname = scanner.next();                      // Storing variables for 2nd user input using scanner object

        System.out.println("Enter sales amount in double");       // message 3 to user for what to enter
        double salesamount = scanner.nextDouble();                // Storing variables for 3rd user input using scanner object

        System.out.println("Enter salary basic in double");       // message 4 to user for what to enter
        double salarybasic = scanner.nextDouble();                // Storing variables for 4th user input using scanner object


        // Storing variables
        double salescom20 = (salesamount * 20/100);
        double salescom10 = (salesamount * 10/100);
        double salescom5 = (salesamount * 5 / 100);
        double salescom2 = (salesamount * 2 / 100);


        if (salesamount >= 50000) {
            System.out.println("Sales commission is 35% i.e., " + (salesamount * 35/100 ));
        } else if (salesamount >= 30000.00) {
            System.out.println("Sales commission is 20% i.e., " + salescom20);

        } else if (salesamount >= 20000.00) {
            System.out.println("Sales commission is 10% i.e., " + salescom10);

        } else if (salesamount >= 10000.00) {
            System.out.println("Sales commission is 5% i.e., " + salescom5);

        } else if (salesamount < 10000) {
            System.out.println("Sales commission is 2% i.e., " + salescom2);
        }
    }
}
