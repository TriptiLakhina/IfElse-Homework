import java.util.Objects;
import java.util.Scanner;

public class Calculation {
    Scanner scanner=new Scanner(System.in);
    int number1, number2;



    public static void main(String[] args) {
        Calculation calculation=new Calculation();
        calculation.calculate();
    }



    void calculate(){
        System.out.println("Enter any 2 numbers in int & press enter after each number");

        int number1=scanner.nextInt();
        int number2=scanner.nextInt();

        System.out.println("Now enter your symbol from + , - , * , /");

        String add="+";
        String sub="-";
        String multiply="*";
        String divide="/";

        String symbol=scanner.next();



        if(Objects.equals(symbol, add)){
            System.out.println("your answer is " + (number1+number2));
        } else if (symbol.equals(sub)) {
            System.out.println("your answer is " + (number1-number2));

        } else if (symbol.equals(multiply)) {
            System.out.println("your answer is " + (number1*number2));

        } else if (symbol.equals(divide)) {
            System.out.println("your answer is " + (number1/number2));

       }else {
            System.out.println("No answer - Invalid entry. Please check symbol input again");
        }


    }
}
