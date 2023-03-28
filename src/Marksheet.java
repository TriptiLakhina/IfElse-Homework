import java.util.Scanner;

public class Marksheet {

    // Creating object for Scanner class to take input
    Scanner scanner=new Scanner(System.in);


    // Global variables
    int total;
    double percent;



    public static void main(String[] args) {

        // creating class object to call non-static method to static area
        Marksheet marksheet=new Marksheet();

        //calling the method using class object
        marksheet.allsubjects();
    }



    // No return type no parameters
    public void allsubjects(){

        // message to user for what to enter
        System.out.println("Please enter student name in string");

        //Storing variables using scanner object
        String name=scanner.next();


        // message 2 to user for what to enter
        System.out.println("Please enter roll no in int");

        //Storing variables for 2nd user input using scanner object
        int rollno=scanner.nextInt();


        // message 3 to user for what to enter
        System.out.println("Please enter int values for marks in Eng, Maths & History pressing enter after each input");

        //Storing variables for 3rd user input using scanner object
        int eng =scanner.nextInt();
        int maths=scanner.nextInt();
        int history=scanner.nextInt();

        // Storing variables
        total= (eng+maths+history);
        percent = (total/3);


        System.out.println("total- " +total);
        System.out.println("percent- " +percent );

        if ((eng>=35) && (maths>=35) && (history>=35)){
            System.out.println("You are pass");
        }
        else {
            System.out.println("You are fail");
        }
        if (((eng>=35) && (maths>=35) && (history>=35)) && (percent>=80)){
            System.out.println("Your grade is A+");
        } else if (((eng>=35) && (maths>=35) && (history>=35)) && (percent>=60)) {
            System.out.println("Your grade is A");

        } else if (((eng>=35) && (maths>=35) && (history>=35)) && (percent>=50)) {
            System.out.println("Your grade is B");

        } else if (((eng>=35) && (maths>=35) && (history>=35)) && (percent>=35)) {
            System.out.println("Your grade is C");

        }

    }

}