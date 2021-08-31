/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package org.example;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("How many euros are exchanging? ");
        double c_from = inp.nextDouble();
        System.out.print("What is the exchange rate? ");
        double rate = inp.nextDouble();

        double c_to = rate * c_from;

        System.out.print(String.format("%.0f", c_from) + " euros at an exchange rate of " + rate + " is\n" + String.format("%.2f", c_to) + " U.S. dollars.");
    }
}
