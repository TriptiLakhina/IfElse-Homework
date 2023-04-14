import java.util.Scanner;

public class LeapYearSelf {

    // Creating object for Scanner class to take input
    Scanner scanner=new Scanner(System.in);


    public static void main (String[] args) {

        // creating class object to call non-static method in static area
        LeapYearSelf leapYear = new LeapYearSelf();

        //calling method using class object
        leapYear.checkleapyear();
    }


    // No return type no parameters
    public void checkleapyear(){
        // message to user for what to enter
        System.out.println("Please enter year in int value");

        //Storing year in variable using scanner object
        int year = scanner.nextInt();

        if ((year % 400 == 0) || (!(year % 100 == 0) && (year % 4 == 0))){
            System.out.println(year + " is a leap year.");

        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}


//          } else if (year % 100 == 0) {
//            System.out.println(year + " is not a leap year.");
//        } else if (year % 4 == 0) {
//            System.out.println(year + " is a leap year.");
