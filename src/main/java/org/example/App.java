/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        final double wis_tax = 5.0 / 100;
        final double wis_eau_tax = 0.005;
        final double wis_dunn_tax = 0.004;
        final double ill_tax = 8.0 / 100;

        double total_tax = 0.0;
        double order_amount = 0.0;

        String state = "";
        String county = "";

        System.out.print("What is the order amount? ");
        order_amount = input.nextDouble();
        input.nextLine();

        System.out.print("What state do you live in? ");
        state = input.nextLine();

        System.out.print("What county do you live in? ");
        county = input.nextLine();

        if (state.equals("Wisconsin"))
        {
            total_tax = order_amount * wis_tax;
            if(county.equals("Dunn"))
            {
                total_tax = total_tax + (order_amount * wis_dunn_tax);
            }
            if(county.equals("Eau Claire"))
            {
                total_tax = total_tax + (order_amount * wis_eau_tax);
            }
        }
        else if(state.equals("Illinois"))
        {
            total_tax = total_tax + (order_amount * ill_tax);
        }
        order_amount = total_tax + order_amount;

        System.out.printf("The tax is $%.2f.%n", total_tax);

        System.out.printf("The total is $%.2f.", order_amount);
    }
}