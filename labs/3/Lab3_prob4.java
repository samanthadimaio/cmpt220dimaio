/**
 * file: Lab3_prob4
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 3: Problem 5.13
 * due date: February 23, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 3 - Problem 5.13 - Find largest n
 * such that n^3 < 12,000
 */
public class Lab3_prob4{
  public static void main(String[] args){
    int n = 0;
    
    while (Math.pow(n + 1, 3) < 12000){
        n++;
    }  
    
    System.out.println("The largest integer n such that n^3 is less than 12,000: " + n);
  }
}