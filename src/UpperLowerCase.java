import java.util.Scanner;

public class UpperLowerCase {
    Scanner scanner=new Scanner(System.in);


    public static void main(String[] args) {
        UpperLowerCase upperLowerCase=new UpperLowerCase();
        upperLowerCase.changecase();
    }



    void changecase(){
        System.out.println("Enter any letter in uppercase");
        String letter=scanner.next();

        System.out.println("Uppercase - " + letter.toUpperCase());
        System.out.println("Lowercase - " + letter.toLowerCase());
    }

}
