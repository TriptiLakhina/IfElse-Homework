import java.util.Scanner;

public class Interchanged {


    public static void main(String[] args) {
        int a, b, c;            //int a & b are to swap
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 numbers in int to swap values. Press enter after each input");

        int originala = scanner.nextInt();
        int originalb = scanner.nextInt();
        System.out.println("Before swapping: " + originala+"   "+originalb);

//        //swapping
        int swapc = originala;
        int swapa = originalb;
        int swapb = swapc;

        System.out.println("After swapping: " + swapa + "   " + swapb);
        System.out.println();


    }


}

