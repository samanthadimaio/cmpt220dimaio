/**
 * file: Lab3_prob1
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 3: Problem 5.1
 * due date: February 23, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 3 - Problem 5.1 - Counts number of pos/neg & computes average
 */
import java.util.Scanner;

public class Lab3_prob1 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int num;
    int positive = 0;  
    int negative = 0;
    int count = 0;
    int sum = 0;
    
    do { 
      System.out.print("Enter an integer (input ends if 0): ");
      num = input.nextInt();
     
      if (num < 0)
        negative++;
      else if (num > 0)
        positive++;
      sum += num;
      count ++;
    } while (num != 0);
    
    float average = sum / count;
    
    System.out.println("The number of positives is " + positive 
                        + "\nThe number of negatives is " + negative
                        + "\nThe total is: " + sum
                        + "\nThe average is: " + average);          
  }
}
    
      
      
    
    