import java.util.Scanner;

public class Sales {
    Scanner scanner=new Scanner(System.in);
    int salesid;
    String sellers_name;
    double salesamount,salarybasic;



    public static void main(String[] args) {
        Sales sales=new Sales();
        sales.salescommission();

    }



    void salescommission() {
        System.out.println("Enter sales id in int");
        int salesid = scanner.nextInt();

        System.out.println("Enter seller's name in string");
        String sellersname = scanner.next();

        System.out.println("Enter sales amount in double");
        double salesamount = scanner.nextDouble();

        System.out.println("Enter salary basic in double");
        double salarybasic = scanner.nextDouble();


        double salescom20 = (salesamount * 0.20);
        double salescom10 = (salesamount * 0.10);
        double salescom5 = (salesamount * 0.05);
        double salescom2 = (salesamount / 50);

//        double salescom10 = (salesamount * (10/100));     // This percentage method didn't work
//        double salescom5 = (salesamount * (5 / 100));     // This percentage method didn't work
//        double salescom2 = (salesamount * (2 / 100));     // This percentage method didn't work

        if (salesamount >= 50000) {
            System.out.println("Sales commission is 35% i.e., " + (0.35 * salesamount));
        } else if (salesamount >= 30000.00) {
            System.out.println("Sales commission is 20% i.e., " + salescom20);

        } else if (salesamount >= 20000.00) {
            System.out.println("Sales commission is 10% i.e., " + salescom10);

        } else if (salesamount >= 10000.00) {
            System.out.println("Sales commission is 5% i.e., " + salescom5);

        } else if (salesamount < 10000) {
            System.out.println("Sales commission is 2% i.e., " + salescom2);
        }
    }
}
