/**
 * file: Lab1_prob3
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 1: 2.5
 * due date: January 26, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 1 - Problem 2.5
 */
import java.util.Scanner;

public class Lab1_prob3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the subtotal and a gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityrate = input.nextDouble();
    double gratuity = gratuityrate/10;
    double total = subtotal + gratuity; 
    
    System.out.println("The gratuity is $" + gratuity + " and the total is $" + total + ".");
  }
}