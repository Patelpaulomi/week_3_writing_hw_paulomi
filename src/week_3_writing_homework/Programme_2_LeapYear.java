package week_3_writing_homework;

import java.util.Scanner;

public class Programme_2_LeapYear {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year :");
        int year = scanner.nextInt();
        Programme_2_LeapYear leapyear = new Programme_2_LeapYear();
        leapyear.isItLeapYear(year);
        //closing scanner
        scanner.close();

    }

    //Checking is it leap year or not
    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year" + year + "is leap year");
            // return;
        } else {
            System.out.println("The year" + year + "is not a leap year");
        }

    }

}
