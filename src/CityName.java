import java.util.Scanner;

public class CityName {

    // Creating object for Scanner class to take input
    Scanner scanner=new Scanner(System.in);

    String cityname;


    public static void main(String[] args) {

        // creating class object to call non-static method to static area
        CityName cityName=new CityName();

        //calling the method using class object
        cityName.a_fcity();
    }


    // No return type no parameters
    void a_fcity(){

        // Writing message for the user for what to enter
        System.out.println("Enter any letter from A-F to get the city name");

        //Storing variables using scanner object
        String cityname=scanner.next();


        if (cityname.equalsIgnoreCase("a")){

            System.out.println("City from " + cityname + " is Aarhus");

        } else if (cityname.equalsIgnoreCase("B")){
            System.out.println("City from " + cityname + " is Berlin");

        } else if (cityname.equalsIgnoreCase("C")) {
            System.out.println("City from " + cityname + " is Copenhagen");

        } else if (cityname.equalsIgnoreCase("D")) {
            System.out.println("City from " + cityname + " is Delhi");

        } else if (cityname.equalsIgnoreCase("E")) {
            System.out.println("City from " + cityname + " is Edinburgh");

        } else if (cityname.equalsIgnoreCase("F")) {
            System.out.println("City from " + cityname + " is Faridabad");

        } else {
            System.out.println("This is an invalid entry - please enter any letter from A to F");
        }
    }
}
