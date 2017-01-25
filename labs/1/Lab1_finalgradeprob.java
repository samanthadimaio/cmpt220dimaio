/**
 * file: Lab1_finalgradeprob
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 1: Number 2: Final Grade Calculator
 * due date: January 26, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 1 - Number 2: Final Grade Calculator
 */
import java.util.Scanner;

public class Lab1_finalgradeprob{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
     System.out.println("Please enter the following as a percentage");
     System.out.println(" ");
     
     System.out.println("Enter your midterm exam grade: ");
     int midterm = input.nextInt();
     
     System.out.println("Enter your final exam grade: ");
     int finalgrade = input.nextInt();
     
     System.out.println("Enter your project grade: ");
     int project = input.nextInt();
     
     System.out.println("Enter your homework and labs grade: ");
     int hwlab = input.nextInt();
     
     int total = (midterm + finalgrade + project + hwlab) / 4;     
     System.out.println("Your final grade is: " + total + "%");
   }
}  