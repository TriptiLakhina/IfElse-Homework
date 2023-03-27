import java.util.Scanner;

public class StudentMarksheetPercentage {
    static Scanner scanner = new Scanner(System.in);
    // Variables to store name, roll no., marks, total, percentage & result
    String name;
    int rollno;
    int eng , maths, history;
    int total;
    double percent;
    boolean result;



    public static void main(String[] args) {
        StudentMarksheetPercentage studentMarksheetPercentage=new StudentMarksheetPercentage();
        studentMarksheetPercentage.score();

    }



    public void score () {
        System.out.println("Please enter student name in string");
        String name=scanner.next();

        System.out.println("Please enter roll no in int");
        int rollno=scanner.nextInt();

        System.out.println("Please enter values in int for marks in Eng, Maths & History pressing enter after each input");
        int eng =scanner.nextInt();
        int maths=scanner.nextInt();
        int history=scanner.nextInt();

        total= (eng+maths+history);
        percent = (total/3);

        System.out.println("total- " +total);
        System.out.println("percent- " +percent );

        if (percent>=35) {
            System.out.println("you are pass");
        }
        if (percent>=80){
            System.out.println("Your grade is A+");
        } else if (percent>=60) {
            System.out.println("Your grade is A");

        } else if (percent>=50) {
            System.out.println("Your grade is B");

        } else if (percent>=35) {
            System.out.println("Your grade is C");

        }
        else {
            System.out.println("You are fail");
        }



    }


}
