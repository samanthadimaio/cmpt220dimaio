/**
 * file: Lab2_prob
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 2: Problem 4.8
 * due date: February 23, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 2 - Problem 4.8 - Turn code in character
 */
import java.util.Scanner;

public class Lab2_prob7{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an ASCII code: ");
    int code = input.nextInt();
    
    if (code > 0 && code < 127) {
      System.out.println("The character for ASCII code " + code + " is " + (char)code);
    }
    else {
      System.out.println("The code you entered is invalid because it is not between 0 and 127");
    }
  }
}