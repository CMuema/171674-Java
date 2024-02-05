/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cmuema.classpractice;

/**
 *
 * @author muema
 */
import java.util.Scanner;
public class Classpractice{
    public static void main(String[] args){
        //Create a Scanner object to read input from user
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: "); //Prompt input of first number
        int num1=in.nextInt();
        System.out.println("Input second number: "); //Prompt input of second number
        int num2=in.nextInt();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); //Calculate and print the solution
        // Calculate and print the difference of the two numbers
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        // Calculate and print the product of the two numbers
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        // Calculate and print the division of the two numbers
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        // Calculate and print the remainder of the division of the two numbers
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
        
    }
}