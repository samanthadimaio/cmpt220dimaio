/**
 * file: Lab2_prob6
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 2: Problem 4.5
 * due date: February 9, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 2 - Problem 4.5: Calculate area of a regular polygon
 */
import java.util.Scanner;

public class Lab2_prob6 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of sides: ");
    int numOfSides = input.nextInt();
    
    System.out.print("Enter the length of the side: ");
    double lengthOfSide = input.nextDouble();
    
    double area = numOfSides * Math.pow(lengthOfSide, 2) / (4 * Math.tan(Math.PI / numOfSides));
    
    System.out.println("The area of the polygon is: " + area);
  }
}  
    