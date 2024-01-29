package chapter4;

import java.util.Scanner;

/*
WHILE LOOP.
Each store employee makes $15 an hour.This program allows the employee to enter the number of
hours worked and not allowes overtime.
 */
public class GrossPayInputValidation {
    public static void main(String arg[]){

        int rate= 15;
        int maxHours= 40;

        System.out.println("How many hours did you work this week?");
        Scanner scanner= new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Yours hours must be between 1 and 40. Try again");
            //sentinel
             hoursWorked= scanner.nextDouble();
        }

        scanner.close();

        double gross= rate * hoursWorked;
        System.out.println("Gross pay: $"+ gross);

    }
}
