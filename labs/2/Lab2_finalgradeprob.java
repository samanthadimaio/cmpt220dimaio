/**
 * file: Lab2_prob5
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 2: Final Grade Calculator
 * due date: February 9, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 2 - Problem 4.1: Calculate area of a pentagon
 */
import java.util.Scanner;
 
public class Lab2_finalgradeprob{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
     
    System.out.println("Please enter the following as a percentage");
    System.out.println(" ");
     
    System.out.println("Enter your midterm exam grade: ");
    double midterm = input.nextDouble();
     
    System.out.println("Enter your final exam grade: ");
    double finalgrade = input.nextDouble();
     
    System.out.println("Enter your project grade: ");
    double project = input.nextDouble();
     
    System.out.println("Enter your homework and labs grade: ");
    double hwlab = input.nextDouble();
     
    double total = (midterm + finalgrade + project + hwlab) / 4;
     
    if (total >= 90.0){
      System.out.println("Your final grade is A");
    }
    
    else if (total >= 80.0){
      System.out.println("Your final grade is B");
    } 
    
    else if (total >= 70.0){      
      System.out.println("Your final grade is C");
    }
    
    else if (total >= 60.0){
      System.out.println("Your final grade is D");
    }
    
    else {
      System.out.println("Your final grade is F");
    }
  }
}