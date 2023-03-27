import java.util.Scanner;

public class Marksheet {
    Scanner scanner=new Scanner(System.in);


    String name;
    int rollno;
    int eng , maths, history;
    int total;
    double percent;
    boolean result;



    public static void main(String[] args) {
        Marksheet marksheet=new Marksheet();
        marksheet.allsubjects();
    }



    public void allsubjects(){
        //     int marks = scanner.nextInt();
        System.out.println("Please enter student name in string");
        String name=scanner.next();

        System.out.println("Please enter roll no in int");
        int rollno=scanner.nextInt();

        System.out.println("Please enter int values for marks in Eng, Maths & History pressing enter after each input");
        int eng =scanner.nextInt();
        int maths=scanner.nextInt();
        int history=scanner.nextInt();

        total= (eng+maths+history);
        percent = (total/3);

        System.out.println("total- " +total);
        System.out.println("percent- " +percent );

        if ((eng>=35) && (maths>=35) && (history>=35)){
            System.out.println("You are pass");
        }
        else {
            System.out.println("You are fail");
        }
        if (((eng>=35) && (maths>=35) && (history>=35)) && (percent>=80)){
            System.out.println("Your grade is A+");
        } else if (((eng>=35) && (maths>=35) && (history>=35)) && (percent>=60)) {
            System.out.println("Your grade is A");

        } else if (((eng>=35) && (maths>=35) && (history>=35)) && (percent>=50)) {
            System.out.println("Your grade is B");

        } else if (((eng>=35) && (maths>=35) && (history>=35)) && (percent>=35)) {
            System.out.println("Your grade is C");

        }

    }

}

