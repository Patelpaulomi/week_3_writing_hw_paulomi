package week_3_writing_homework;

public class Programme_11_DividedByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Number divisible by 3 are :");
        for (int i = 1; i <= 100; i++) {
            dividedByThree(i);
        }
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("Number divisible by 5 are :");
        for (int x = 1; x <= 100; x++) {
            dividedByFive(x);
        }
    }

    //Divided by Three method
    public static void dividedByThree(int number) {
        if (number % 3 == 0) {
            System.out.println(number + ",");
        }
    }

    // Divided by Five method
    public static void dividedByFive(int number) {
        if (number % 5 == 0) {
            System.out.println(number + ",");
        }
    }


}




