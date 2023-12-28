package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        //get the number of hours worked
    System.out.println("Enter the number of hours employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //get the hourly pay taye
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();

        //multiply hours and pay rate
        double grossPay= hours * rate;

        //diplay result
        System.out.println("The employee's gross pay is $"+grossPay);

    };
}
