import java.util.Scanner;

public class Interchanged {


    public static void main(String[] args) {
        int a, b, c;            //int a & b are to swap

        // Creating object for Scanner class to take input
        Scanner scanner=new Scanner(System.in);

        // Writing message to the user for what to enter
        System.out.println("Enter 2 numbers in int to swap values. Press enter after each input");

        //Storing variables using scanner object
        int originala = scanner.nextInt();
        int originalb = scanner.nextInt();
        System.out.println("Before swapping: " + originala+"   "+originalb);

       //swapping
        int swapc = originala;
        int swapa = originalb;
        int swapb = swapc;

        System.out.println("After swapping: " + swapa + "   " + swapb);


    }


}

