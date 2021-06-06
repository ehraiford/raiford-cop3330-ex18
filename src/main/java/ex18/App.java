/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex18;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit. ");
        String choice = in.nextLine();
        String start = "", end = "";
        if(choice.compareTo("c") == 0 || choice.compareTo("C") == 0) {
            start = "Fahrenheit";
            end = "Celsius";
        }
        if(choice.compareTo("f") == 0 || choice.compareTo("F") == 0) {
            start = "Celsius";
            end = "Fahrenheit";
        }

        System.out.print("Please enter a temperature in " + start + ": ");
        double initTemp = in.nextDouble();
        double result;
        if(start.compareTo("Fahrenheit") == 0) {
            result = ((initTemp - 32) * 5) / 9;
        }else
            result = (initTemp * 9  / 5) + 32;
        System.out.println("The temperature in " + end + " is " + result + ".");
    }
}
