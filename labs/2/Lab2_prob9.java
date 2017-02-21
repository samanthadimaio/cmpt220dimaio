/**
 * file: Lab2_prob9
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 2: Problem 4.15
 * due date: February 23, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 2 - Problem 4.15 - Corresponding letter to num
 */
import java.util.Scanner;

public class Lab2_prob9{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter a letter: ");
    String s = input.nextLine();
    char ch = s.charAt(0);
    ch = Character.toUpperCase(ch);
    
    int num = 0;
    
    if (Character.isLetter(ch)) {
      if (ch >= 'W')
        num = 9;
      else if (ch >= 'T')
        num = 8;
      else if (ch >= 'P')
        num = 7;
      else if (ch >= 'M')
        num = 6;
      else if (ch >= 'J')
        num = 5;
      else if (ch >= 'G')
        num = 4;
      else if (ch >= 'D')
        num = 3;
      else if (ch >= 'A')
        num = 2;
      System.out.println("The corresponding number is " + num);
    }
  }
}
                      