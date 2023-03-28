import java.util.Scanner;

public class DayName {

    // Creating object for Scanner class to take input
    Scanner scanner=new Scanner(System.in);

    // Global variable
    String day1 ="Monday";



    public static void main(String[] args) {

        // creating class object to call non-static method to static area
        DayName dayName=new DayName();

        //calling the method using class object
        dayName.daycheck();
    }



    // No return type no parameters
    void daycheck(){

        // Writing message for the user for what to enter
        System.out.println("Enter any number from 1-7");

        //Storing variables using scanner object
        int daynumber=scanner.nextInt();



        if (daynumber==1){
            System.out.println("Day number 1 of the week is " + day1);
        }else if (daynumber==2){
            System.out.println("Day number 2 of the week is Tuesday");
        } else if (daynumber==3) {
            System.out.println("Day number 3 of the week is Wednesday");
        } else if (daynumber==4) {
            System.out.println("Day number 4 of the week is Thursday");
        } else if (daynumber==5) {
            System.out.println("Day number 5 of the week is Friday");
        } else if (daynumber==6) {
            System.out.println("Day number 6 of the week is Saturday");
        } else if (daynumber==7) {
            System.out.println("Day number 7 of the week is Sunday");
        }else {
            System.out.println("Invalid entry - Please enter numbers from 1-7 only");
        }
    }
}
