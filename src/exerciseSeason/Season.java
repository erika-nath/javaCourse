package exerciseSeason;

import java.util.Scanner;

public class Season {
    public static void main(String[] args){
        System.out.println("Could you write the season of now the season of the year it's at the moment");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Write a random entire number");
        int number = scanner.nextInt();

        System.out.println("Now write an adjetive");
        String adjetive = scanner.next();

        scanner.close();

        System.out.println("On a "+adjetive+" "+season+" day,I drink a minimum of "+number+" cups of coffe.");

    }
}
