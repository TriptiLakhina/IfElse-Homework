import java.util.Scanner;

public class StudentMarksheetPercentage {
    Scanner scanner = new Scanner(System.in);               // Creating object for Scanner class to take input


    // Global variables
    int total;
    double percent;




    public static void main(String[] args) {
        StudentMarksheetPercentage studentMarksheetPercentage=new StudentMarksheetPercentage();     // creating class object to call non-static method to static area
        studentMarksheetPercentage.score();                                                         //calling the method using class object

    }



    // No return type no parameters
    public void score () {
        System.out.println("Please enter student name in string");              // message to user for what to enter
        String name=scanner.next();                                             //Storing variables using scanner object

        System.out.println("Please enter roll no in int");                      // message 2 to user for what to enter
        int rollno=scanner.nextInt();                                           //Storing variables for 2nd user input using scanner object

        // message 3 to user for what to enter
        System.out.println("Please enter values in int for marks in Eng, Maths & History pressing enter after each input");

        //Storing variables for 3rd user input using scanner object
        int eng =scanner.nextInt();
        int maths=scanner.nextInt();
        int history=scanner.nextInt();

        // Storing variables
        total= (eng+maths+history);
        percent = (total/3);

        System.out.println("total- " +total);
        System.out.println("percent- " +percent );

        if (percent>=35) {
            System.out.println("you are pass");
        }
        if (percent>=80){
            System.out.println("Your grade is A+");
        } else if (percent>=60) {
            System.out.println("Your grade is A");

        } else if (percent>=50) {
            System.out.println("Your grade is B");

        } else if (percent>=35) {
            System.out.println("Your grade is C");

        }
        else {
            System.out.println("You are fail");
        }



    }


}
