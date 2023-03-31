package week_3_writing_homework;

import java.util.Scanner;

public class Programme_16_FindPositivNegative {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        findNumberISPositiveNegativeOrZero(number);
        // scanner close
        scanner.close();

    }

    //finding the number is positive Negative or Zero
    public static void findNumberISPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + "is a POSITIV number");
        } else if (number < 0) {
            System.out.println(number + "is a NEGATIVE number");
        } else {
            System.out.println(number + "is ZERO number");
        }

    }
}
