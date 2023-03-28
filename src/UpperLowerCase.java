import java.util.Scanner;

public class UpperLowerCase {
    Scanner scanner=new Scanner(System.in);             // Creating object for Scanner class to take input


    public static void main(String[] args) {
        UpperLowerCase upperLowerCase=new UpperLowerCase();         // creating class object to call non-static method to static area
        upperLowerCase.changecase();                                // calling the method using class object
    }



    // No return type no parameters
    void changecase(){
        System.out.println("Enter any letter in uppercase");         // message to user for what to enter
        String letter=scanner.next();                                //Storing variables using scanner object

        System.out.println("Uppercase - " + letter.toUpperCase());
        System.out.println("Lowercase - " + letter.toLowerCase());
    }

}
