import java.util.Scanner;

public class FiveNumberAverage {
    Scanner scanner=new Scanner(System.in);

    int a, b, c, d, e;



    public static void main(String[] args) {
        FiveNumberAverage fiveNumberAverage=new FiveNumberAverage();
        fiveNumberAverage.average();
    }



    void average(){
        System.out.println("Enter 5 numbers pressing enter after each number.");

        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int e=scanner.nextInt();

        double average=((a+b+c+d+e)/5);

        System.out.println("average of these 5 numbers is " + average);
    }
}
