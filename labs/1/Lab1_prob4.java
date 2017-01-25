/**
 * file: Lab1_prob4
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 1: 2.6
 * due date: January 26, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 1 - Problem 2.6
 */
import java.util.Scanner;

public class Lab1_prob4{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number between 0 and 1000:");
    double number = input.nextDouble();
    double int1 = number%10;
    double remove1 = (int)number/10;
    double int2 = remove1%10;
    double remove2 = (int)remove1/10;
    double int3 = remove2%10;
    
    double sum = int1 + int2 + int3;
    
    System.out.println("The sum of the digits is: " + sum + ".");
  }
} 
    