/**
 * file: Lab2_prob1
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 2: Problem 3.4
 * due date: February 9, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 2 - Problem 3.4: Random Month Generator
 */
import java.util.Scanner;

public class Lab2_prob1{
  public static void main(String[] args){
    int numOfMonth = 1 + (int)(Math.random() * 12);
    
    if (numOfMonth == 1){
      System.out.println("You generated the month January!");
    }
    
    else if (numOfMonth == 2){
      System.out.println("You generated the month February!");
    }
    
    else if (numOfMonth == 3){
      System.out.println("You generated the month March!");
    }
    
    else if (numOfMonth == 4){
      System.out.println("You generated the month April!");
    }
    
    else if (numOfMonth == 5){
      System.out.println("You generated the month May!");
    }
    
    else if (numOfMonth == 6){
      System.out.println("You generated the month June!");
    }
    
    else if (numOfMonth == 7){
      System.out.println("You generated the month July!");
    }  
    
    else if (numOfMonth == 8){
      System.out.println("You generated the month August!");
    }
    
    else if (numOfMonth == 9){
      System.out.println("You generated the month September!");
    }
    
    else if (numOfMonth == 10){
      System.out.println("You generated the month October!");
    }
    
    else if (numOfMonth == 11){
      System.out.println("You generated the month November!");
    }
    
    else if (numOfMonth == 12){
      System.out.println("You generated the month December!");
    }
  }
}
    