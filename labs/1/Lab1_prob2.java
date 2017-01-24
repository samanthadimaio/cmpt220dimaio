/**
 * file: Lab1_prob2
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 1: 2.1
 * due date: January 26, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 1 - Problem 2.1
 */
import java.util.Scanner;
 
public class Lab1_prob2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a degree in Celsius:");
    double celsius = input.nextDouble();
    double fahrenheit = (9.0 / 5) * celsius + 32;
     
    System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
  }
}