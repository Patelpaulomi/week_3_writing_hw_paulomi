package week_3_writing_homework;

import java.util.Scanner;

public class Programme_6_OddEven {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        Programme_6_OddEven oddEven = new Programme_6_OddEven();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + "number");
        //Closing scanner
        scanner.close();
    }
    //Checking odd or even number
    public String isItEvenOrOddNumber(int number){
        if(number % 2 == 0){
            return "Even";
        }else{
            return "odd";
        }

    }
}
