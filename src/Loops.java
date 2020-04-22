import java.util.Scanner;

/**
 * for loop to print numbers
 * for loop to print number backwards
 * */



public class Loops {
    public static void main(String[] args) {
        System.out.println("Below are numbers 1-10.");
        for (int index = 1; index <= 10; index++) {
            System.out.println(index);
        }
        System.out.println();

        System.out.println("Below are numbers 1-10 in reverse order.");
        for (int index = 10; index >= 0 && index < 11; index--) {
            System.out.println(index);
        }
        System.out.println();

        System.out.println("Odd numbers from 1-20");
        for (int index = 0; index < 20; index++) {
            if ((index % 2) != 0) {
                System.out.println(index);
            }
        }

        System.out.println();

        System.out.println("Even numbers from 1-20");
        for (int index = 0; index < 20; index++) {
            if ((index % 2) == 0) {
                System.out.println(index);
            }
        }

        System.out.println();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int num = keyboard.nextInt();
        for (int index = 0; index < num; num--) {
            System.out.println(num);
        }

        System.out.println();

        int sum = 0;
        System.out.println("Sum of numbers 1-10");
        for (int index = 0; index <= 10; index++) {
            sum += index;
        }
        System.out.println(sum);

        System.out.println();

        System.out.println("Enter a number");
        int numSum = keyboard.nextInt();
        int sum2 = 0;
        for (int index = 1; index <= numSum; index++){
            sum2 += index;
        }
        System.out.println(sum2);

        //Number 8
        System.out.println("This prints out stars");
        for (int index = 0; index <= 3; index++){
            System.out.println("**********");
        }

        System.out.println("This prints out ordered stars");
        for (int index = 0; index <= 4; index++){
            for (int index2 = 0; index2 <= index; index2++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("This prints out reverse ordered stars");
        for (int index = 0; index <= 4; index++){
            for (int index3 = 0; index3 <= 4-index; index3++){
                System.out.print(" ");
            }
            for (int index4 = 0; index4 <= index; index4++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("This is the factorial portion of the code");
        System.out.println("Input a number");
        int multiple = keyboard.nextInt();
        int result = 1;
        for (int index5 = 1; index5 <= multiple; index5++){
            result = index5 * result;
        }
        System.out.println(result);

    }
}
