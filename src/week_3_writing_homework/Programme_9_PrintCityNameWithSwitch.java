package week_3_writing_homework;

import java.util.Scanner;

public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F");
        String city = scanner.next();
        //Create object and call instance method
        Programme_9_PrintCityNameWithSwitch cityNameWithSwitch = new Programme_9_PrintCityNameWithSwitch();
        cityNameWithSwitch.printCityName(city);
        //closing the scanner
        scanner.close();

    }

    //Printing city name
    public void printCityName(String city){
        switch (city){
            case "A" :
                System.out.println("Aberdeen");
                break;
            case"B" :
                System.out.println("Belfast");
                break;
            case"C" :
                System.out.println("Cambridge");
                break;
            case"D" :
                System.out.println("Derby");
                break;
            case"E" :
                System.out.println("Edinburgh");
                break;
            case "F" :
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }

}
