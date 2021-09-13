/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package Base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many people? ");
        String people = in.nextLine();
        System.out.print("How many pizzas do you have? ");
        String pizza = in.nextLine();
        System.out.print("How many slices per pizza? ");
        String slices = in.nextLine();

        int a = Integer.parseInt(people);
        int b = Integer.parseInt(pizza);
        int c = Integer.parseInt(slices);

        int total = b * c;
        int person = total / a;
        int leftover = total % a;

        System.out.println(people + " people with " + pizza + " pizzas. (" + total + " slices)\nEach person gets " + person + " pieces of pizza.\nThere are " + leftover + " leftover pieces.");
    }
}
