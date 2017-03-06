/**
 * file: Lab4_prob2.java
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 4: Problem 6.20
 * due date: March 9, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 4 -  Problem 6.20 - Count the letters in a string
 */
import java.util.Scanner;

public class Lab4_prob2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    String s = input.nextLine();
    
    System.out.println("Number of letters in the string is: " + countLetters(s));
  
  }
  
  public static int countLetters(String s) {
    int letters = 0;
    
    for (int i = 0; i < s.length(); i++) {  //for loop to check entire length & to ignore possible spaces
      if (Character.isLetter(s.charAt(i)))
        letters++;
    }
        
    return letters;
  }
}
    