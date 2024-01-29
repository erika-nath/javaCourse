package chapter4;

import java.util.Scanner;

/*
* FOR LOOP
* Cashier program that will scan a given number of items and total
*/
public class Cashier_forLoop {
    public static void main(String args[]){
        System.out.println("Enter the numbver of items you would you like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity= scanner.nextInt();
        double total=0;

        for(int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item");
            double price= scanner.nextDouble();

            total=total+ price;
        }
        scanner.close();

        System.out.println("Your total is: $"+total);
    }
}
