import java.util.Scanner;

public class VoteEligibility {
    Scanner scanner=new Scanner(System.in);
    int age;


    public static void main(String[] args) {
        VoteEligibility voteEligibility=new VoteEligibility();
        voteEligibility.eligibility();
    }


    void eligibility(){
        System.out.println("Please enter your age in int");
        int age=scanner.nextInt();

        if (age>=18){
            System.out.println("You are eligible to vote as your age is " + age + " i.e., 18 & over");
        }else {
            System.out.println("You are not eligible to vote as your age is " + age + " i.e., below 18");
        }

    }
}
