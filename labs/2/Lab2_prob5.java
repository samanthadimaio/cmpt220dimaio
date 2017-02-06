/**
 * file: Lab2_prob5
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 2: Problem 4.1
 * due date: February 9, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 2 - Problem 4.1: Calculate area of a pentagon
 */
import java.util.Scanner;

public class Lab2_prob5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the length from the center to a vertex: ");
    double radius = input.nextDouble();
    
    double side = 2 * radius * Math.sin(Math.PI / 5);
    
    double area = 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));
    area = Math.round(area * 100) / 100.0; 
    
    System.out.println("The area of the pentagon is: " + area);
    
  }
}
    
    
    
     
    
