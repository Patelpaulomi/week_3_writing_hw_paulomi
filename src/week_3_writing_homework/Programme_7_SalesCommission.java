package week_3_writing_homework;

import java.util.Scanner;

public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Seller Name");
        String name = scanner.nextLine();
        System.out.println("Enter Seller Id");
        int sellerId = scanner.nextInt();
        System.out.println("Enter Sales Amount");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Basic Salary");
        int basicSalary = scanner.nextInt();

        //Creating object to call instance method
        Programme_7_SalesCommission salesCommission = new Programme_7_SalesCommission();
        int grossSalary = basicSalary + salesCommission.CalculateCommission(salesAmount);
        System.out.println("Seller name is              :" + name);
        System.out.println("seller Id is                :" + sellerId);
        System.out.println("Seller's sales amount is    :" + salesAmount);
        System.out.println("Seller's basic salary is    :" + basicSalary);
        System.out.println("Seller's gross salary is    :" + grossSalary);

        //closing scanner
        scanner.close();

    }
    //Calculating the sales commission
    public int CalculateCommission(int salesAmount){
        int commission;
        if(salesAmount >= 50000){
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is" + commission);
        }else if (salesAmount >=30000){
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        }else if (salesAmount >=20000){
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales Commission is " + commission);
        }else if (salesAmount >= 10000){
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        }else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Commission is" + commission);
        }
        return commission;
    }


}
