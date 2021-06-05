/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex06.base;

import java.time.Year;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your current age? ");
        int currentAge = input.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retireAge = input.nextInt();

        int yearsLeft = retireAge - currentAge;
        int currentYear = Year.now().getValue();
        int retireYear = currentYear + yearsLeft;

        System.out.printf("You have %d years left until you can retire.%n", yearsLeft);

        System.out.printf("It is %d, so you can retire in %d.", currentYear, retireYear);

    }
}
