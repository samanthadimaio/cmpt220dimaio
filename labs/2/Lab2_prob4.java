/**
 * file: Lab2_prob4
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 2: Problem 3.15
 * due date: February 9, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 2 - Problem 3.15: Lottery game update
 */
import java.util.Scanner;

public class Lab2_prob4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //generate a three digit number instead of two digit
    int lottery = (int)(Math.random() * 1000);
    
    System.out.print("Enter your lottery guess (a three-digit number): ");
    int guess = input.nextInt();
    
    int lotteryDigit1 = lottery / 100; 
    int leftoverDigits = lottery % 100;
    int lotteryDigit2 = leftoverDigits / 10;
    int lotteryDigit3 = leftoverDigits % 10;
    
    int guessDigit1 = guess / 100;
    int leftoverDigits1 = guess % 100;
    int guessDigit2 = leftoverDigits1 / 10;
    int guessDigit3 = leftoverDigits1 % 10;
    
    System.out.println("The lottery number is: " + lottery);
    
    //Check guess
    if (guess == lottery) {
      System.out.println("Exact match: you win $10,000");
    }

    else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
             || (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3) 
             || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
             || (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)
             || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2))      
     {
      System.out.println("Match all digits: you win $3,000!");
    }
    
    else if (guessDigit1 == lotteryDigit1 
             || guessDigit1 == lotteryDigit2
             || guessDigit1 == lotteryDigit3
             || guessDigit2 == lotteryDigit1
             || guessDigit2 == lotteryDigit2
             || guessDigit2 == lotteryDigit3
             || guessDigit3 == lotteryDigit1
             || guessDigit3 == lotteryDigit2
             || guessDigit3 == lotteryDigit3) {
      System.out.println("Match one digit: you win $1,000!");
    } 
    
    else {
      System.out.println("Sorry, no match!");
    }
  }
}
  
