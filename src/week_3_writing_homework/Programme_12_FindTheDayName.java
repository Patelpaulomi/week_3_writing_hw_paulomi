package week_3_writing_homework;

import java.util.Scanner;

public class Programme_12_FindTheDayName {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = scanner.next().charAt(0);
        // object calling
        Programme_12_FindTheDayName inputValue = new Programme_12_FindTheDayName();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing scanner
        scanner.close();

    }
    // find the input value is ALPHABET , DIGIT, and SYMBOL

    public void checkInputValueIsAlphabetNumberOrSymbol(char ch){
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + "is an Alphabet.");
        }else if (ch >= '0' && ch <= '9'){
            System.out.println(ch + "is a DIGIT.");
        }else {
            System.out.println(ch + "is a SYMBOL");
        }
    }
}
