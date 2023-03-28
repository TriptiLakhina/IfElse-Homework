import java.util.Scanner;

public class VoteEligibility {
    Scanner scanner=new Scanner(System.in);             // Creating object for Scanner class to take input



    public static void main(String[] args) {
        VoteEligibility voteEligibility=new VoteEligibility();    // creating class object to call non-static method to static area
        voteEligibility.eligibility();                            // calling the method using class object
    }


    // No return type no parameters
    void eligibility(){
        System.out.println("Please enter your age in int");     // message to user for what to enter
        int age=scanner.nextInt();                              //Storing variables using scanner object

        if (age>=18){
            System.out.println("You are eligible to vote as your age is " + age + " i.e., 18 & over");
        }else {
            System.out.println("You are not eligible to vote as your age is " + age + " i.e., below 18");
        }

    }
}
