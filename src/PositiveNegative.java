import java.util.Scanner;

public class PositiveNegative {
    Scanner scanner=new Scanner(System.in);

    int mynum;

    public static void main(String[] args) {
        PositiveNegative positiveNegative=new PositiveNegative();
        positiveNegative.numbercheck();

    }


    void numbercheck(){
        System.out.println("Enter a number in int value");
        int mynum=scanner.nextInt();

        if (mynum>0){
            System.out.println(mynum + " is a positive number");

        } else if (mynum<0) {
            System.out.println(mynum + " is a negative number");

        }else {
            System.out.println("This number is zero");
        }


    }
}
