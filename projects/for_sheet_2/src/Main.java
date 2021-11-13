import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // print_miles_table();
        // calculate_tuition();
        // two_heighest_scores();
        // System.out.println(sum_digits(22));
        // System.out.println(reverse(432));
        // System.out.println(is_palindrome(333));

        // display_sorted_numbers(3, 1, 2);



    }

    // 5.4
    public static void print_miles_table() {
        System.out.println("miles\tkilometers");
        for(int i = 1 ; i < 11 ; i++) {
            System.out.println(i + "\t\t" + i*1609);
        }
    }

    // 5.7
    public static void calculate_tuition() {
        double moneyPerYear = 10000;
        for(int i = 0 ; i < 10 ; i++){
            moneyPerYear = moneyPerYear + 0.05 * moneyPerYear;
            System.out.printf("year %d = %.2f $\n", i+1, moneyPerYear);
        }

        System.out.println("-----------------------------");

        double neededMoney = 0;
        for(int i = 0 ; i < 4 ; i++) {
            moneyPerYear = moneyPerYear + 0.05 * moneyPerYear;
            neededMoney = neededMoney + moneyPerYear;
        }

        System.out.printf("needed money after 10 years in four year is %.2f $", neededMoney);
    }

    // 5.9
    public static void two_heighest_scores() {
        // create a scanner
        Scanner scanner = new Scanner(System.in);

        // take number of students
        System.out.print("enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // create two arrays one for names and another one for scores
        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];

        // take input
        for(int i = 0 ; i < numberOfStudents ; i++) {
            System.out.print("enter name of the student #" + (i + 1) + " : ");
            names[i] = scanner.next();

            System.out.print("enter student " + (i + 1) + " score: ");
            scores[i] = scanner.nextInt();
        }

        int greatestScore = scores[0];
        int indexOfGreatestStudent = 0;

        for(int i = 1 ; i < numberOfStudents ; i++) {
            if(scores[i] > greatestScore){
                indexOfGreatestStudent = i;
            }
        }

        int indexOfSecond = 0;

        for(int i = 0 ; i < numberOfStudents ; i++) {
            if (i == indexOfGreatestStudent){
                continue;
            }
            if(scores[i] > greatestScore) {
                indexOfSecond = i;
            }
        }

        System.out.println("1. " + names[indexOfGreatestStudent] + " -->> " + scores[indexOfGreatestStudent]);
        System.out.println("2. " + names[indexOfSecond] + " -->> " + scores[indexOfSecond]);
    }

    // 6.2
    public static int sum_digits(long num) {
        int res = 0;
        while(num > 0) {
            res = res + (int) (num % 10);
            num = num / 10;
        }
        return res;
    }

    // 6.3
    public static int reverse(int number) {

        int reversed = 0;

        while(number != 0) {

            int digit = number % 10;
            reversed = reversed * 10 + digit;

            number /= 10;
        }

        return reversed;
    }

    // 6.3
    public static boolean is_palindrome(int num) {
        return (num == reverse(num));
    }

    // 6.5
    public static void display_sorted_numbers(double x, double y, double z) {

        if(x < y && x < z) {
            if(y < z) {
                System.out.println(x + " -> " + y + " -> "+ z);
            }
            else if(z < y) {
                System.out.println(x + " -> " + z + " -> "+ y);
            }
        }

        if(y < x && y < z) {
            if(x < z) {
                System.out.println(y + " -> " + x + " -> "+ z);
            }
            else if(z < x) {
                System.out.println(y + " -> " + z + " -> "+ x);
            }
        }

        if (z < x && z < y) {
            if(x < y) {
                System.out.println(z + " -> " + x + " -> "+ y);
            }
            else if (y < x) {
                System.out.println(z + " -> " + y + " -> "+ x);
            }
        }
    }

}
