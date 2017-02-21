/**
 * file: Lab2_prob10
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 2: Problem 4.25
 * due date: February 23, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 2 - Problem 4.25 - Vehicle Plate Generator
 */
public class Lab2_prob10{
  public static void main(String[] args){
  
  //3 letters (A-Z)
  int letter1 = 65 + (int)(Math.random() * (90 - 65));
  int letter2 = 65 + (int)(Math.random() * (90 - 65));
  int letter3 = 65 + (int)(Math.random() * (90 - 65)); 
  
  //4 numbers
  int num1 = (int)(Math.random()*10);
  int num2 = (int)(Math.random()*10);
  int num3 = (int)(Math.random()*10);
  int num4 = (int)(Math.random()*10);
  
  System.out.println("Your License Plate is: " + ((char)(letter1)) + ((char)(letter2)) + ((char)(letter3))
                       + num1 + num2 + num3 + num4);
  }
}