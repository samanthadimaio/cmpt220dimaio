/**
 * file: Lab3_prob3
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 3: Problem 5.1
 * due date: February 23, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 3 - Problem 5.12 - Find smallest n
 * such that n^2 > 12,000
 */
public class Lab3_prob3 {
  public static void main(String[] args){
    int n = 0;

    while (Math.pow(n, 2) <= 12000){
      if (Math.pow(n, 2) < 12000)
        n++;
    }  
    System.out.println("The smallest integer n such that n^2 is greater than 12,000: " + n);
  }
}
      