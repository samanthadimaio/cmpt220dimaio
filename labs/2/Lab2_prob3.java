/**
 * file: Lab2_prob3
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 2: Problem 3.11
 * due date: February 9, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 2 - Problem 3.11: Find number of days in a month
 */
 
import java.util.Scanner; 

public class Lab2_prob3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of any month (1-12): ");
    int month = input.nextInt();
    
    System.out.print("Enter any year: ");
    int year = input.nextInt();
    
    switch (month){
      case 1: System.out.println("January " + year + " had 31 days"); break;
      case 2: System.out.println("February " + year + " had 28 days.. Unless it was a leap year :)"); break;
      case 3: System.out.println("March " + year + " had 31 days"); break;
      case 4: System.out.println("April " + year + " had 30 days"); break;
      case 5: System.out.println("May " + year + " had 31 days"); break;
      case 6: System.out.println("June " + year + " had 30 days"); break;
      case 7: System.out.println("July " + year + " had 31 days"); break;
      case 8: System.out.println("August " + year + " had 31 days"); break;
      case 9: System.out.println("September " + year + " had 30 days"); break;
      case 10: System.out.println("October " + year + " had 31 days"); break;
      case 11: System.out.println("November " + year + " had 30 days"); break;
      case 12: System.out.println("December " + year + " had 31 days"); break;
    }
  }
}

