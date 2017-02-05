/**
 * file: Lab2_prob2
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 2: Problem 3.8
 * due date: February 9, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 2 - Problem 3.8: Sort three integers
 */
import java.util.Scanner;

public class Lab2_prob2 {
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    int int1 = input.nextInt();
    
    System.out.print("Enter another integer: ");
    int int2 = input.nextInt();
    
    System.out.print("Enter another integer: ");
    int int3 = input.nextInt();
    
    System.out.println("These integers in non-decreasing order are: ");
    
    if (int3 <= int1 && int3 <= int2){
      if (int2 <= int1)
        System.out.println(int3 + " " + int2 + " " + int1 + " ");
      else
        System.out.println(int3 + " " + int1 + " " + int2 + " ");     
    }
    
    else if (int2 <= int1 && int2 <= int3){
      if (int3 <= int1)
        System.out.println(int2 + " " + int3 + " " + int1 + " ");
      else
        System.out.println(int2 + " " + int1 + " " + int3 + " ");
    }
    
    else if (int1 <= int2 && int1 <= int3){
      if (int2 <= int3)
        System.out.println(int1 + " " + int2 + " " + int3 + " ");
      else
        System.out.println(int1 + " " + int3 + " " + int2 + " ");
    }
  }
}
      
      
      
      
      
      
      