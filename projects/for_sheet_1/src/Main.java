import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q. 1.9
        area();

        // Q. 1.11
        population();

        // Q. 2.5
        subtotal();

        // Q. 2.6
        sumOfDigits();

        // Q. 3.5
        findFutureDay();
    }


    //-----------------------------------
    public static void area() {
        // q. 1.9
        double area = 4.5 * 7.9;
        System.out.println("the area is " + area);
    }
    //-----------------------------------

    //-----------------------------------
    public static void population() {
        int oldPopulation = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60;

        long newPopulation = 0;
        for (int i = 0 ; i < 5 ; i++){
            newPopulation = newPopulation + oldPopulation + (secondsPerYear/7) + (secondsPerYear/45) - (secondsPerYear/13);
            System.out.println("the population in year " + (i + 1) + " is " + newPopulation);
        }
    }
    //-----------------------------------

    //-----------------------------------
    public static void subtotal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the subtotal: ");
        int subtotal = scanner.nextInt();

        System.out.print("enter gratuity rate: ");
        int rate = scanner.nextInt();


        double res;
        res = subtotal + ((rate/100.0) * subtotal);

        System.out.println("the total is " + res);

    }
    //-----------------------------------

    //-----------------------------------
    public static void sumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        int res = 0;
        while(number > 0){
            res = res + number % 10;
            number = number / 10;
        }
        System.out.println("the sum of digits is : " + res);

    }
    //-----------------------------------

    //-----------------------------------
    public static void findFutureDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a day number: ");
        int today = scanner.nextInt();

        System.out.print("enter how far the day in the future: ");
        int futureDay = scanner.nextInt();

        switch((futureDay - today) % 7){
            case 0:
                System.out.println("the future day is : sunday");
                break;

            case 1:
                System.out.println("the future day is : monday");
                break;

            case 2:
                System.out.println("the future day is : teusday");
                break;

            case 3:
                System.out.println("the future day is : wendsday");
                break;

            case 4:
                System.out.println("the future day is : thursday");
                break;

            case 5:
                System.out.println("the future day is : friday");
                break;

            case 6:
                System.out.println("the future day is : saturday");
                break;

            default:
                System.out.println("wrong input");
                break;
        }

    }
    //-----------------------------------







}
