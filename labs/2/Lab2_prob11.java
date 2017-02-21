/**
 * file: Lab2_prob11
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 2: Problem 4.26
 * due date: February 23, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 2 - Problem 4.26 - Updating Compute Change
 */
import java.util.Scanner; 

public class Lab2_prob11{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an amount (For example, 11.56): ");
    String amount = input.nextLine();
    
    String numOfDollars = amount.substring(0, amount.indexOf('.'));
    
    int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
    
    int numOfQuarters = cents / 25;
    cents %= 25;
    
    int numOfDimes = cents / 10; 
    cents %= 10;
    
    int numOfNickels = cents / 5;
    cents %= 5;
    
    System.out.println("Your amount: " + amount + " consists of \n" + numOfDollars + " dollars\n "
                       + numOfQuarters + " quarters\n " + numOfDimes + " dimes \n " 
                       + numOfNickels + " nickels\n " + cents + " pennies\n ");
    
  }
}
