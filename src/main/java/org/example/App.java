/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int people=0,pizzas=0,slicesPerPizza=0;
        while(true) {
            try {
                people = Integer.parseInt(strIO("How many people? ", sc));
                pizzas = Integer.parseInt(strIO("How many pizzas do you have? ", sc));
                slicesPerPizza = Integer.parseInt(strIO("How many slices per pizza? ", sc));
            } catch( Exception ex)
            {
                System.out.println("please enter a numeric value and try again");
                continue;
            }
            break;
        }
        int totalSlices= pizzas * slicesPerPizza;
        int amtOfSlicesPerPerson = totalSlices / people;
        int leftover= totalSlices % people;
        System.out.println(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)");
        System.out.println("Each person gets " + amtOfSlicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces." );
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
