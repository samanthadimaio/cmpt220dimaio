/**
 * file: Lab3_prob4
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 3: Problem 6.3
 * due date: February 23, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 3 - Problem 6.3- Check for Palindrome number
 * 
 */
import java.util.Scanner;

public class Lab3_prob6{
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  int number;
  boolean palindrome;
  
  System.out.println("Enter an integer: "); 
  number = input.nextInt();
  
  palindrome = isPalindrome(number);
  
  if (palindrome)
    System.out.println (number + " is a Palindrome Number");
  else
    System.out.println (number + " is not a Palindrome Number");
  }
  
  public static boolean isPalindrome(int x) {
    int r = reverse(x);
    
    if (r == x) {
      return true;
    }
    
    else {
      return false;     
    } 
  }
  
  public static int reverse(int x) {
    int r = 0;
    int remainder;
    
    do {
      remainder = x % 10;
      r = r * 10 + remainder;
      x = x/10;
    } while (x > 0);
    
    return r;
  }
}
  
    
    
    