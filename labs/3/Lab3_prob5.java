/**
 * file: Lab3_prob4
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 3: Problem 6.2
 * due date: February 23, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 3 - Problem 6.3 - Palindrome integer
 * 
 */
import java.util.Scanner;

public class Lab3_prob5 {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter an int: ");
    long num = input.nextLong();
    
    System.out.println("The sum of the digits you entered is: " + sumDigits(num));
  }
  
//method created which the number entered will go into
  public static long sumDigits(long x){
    int total = 0;
    while (x > 0) {
      total += x % 10; 
      x /= 10;
    }
    return total;
  }
}
    
  
  