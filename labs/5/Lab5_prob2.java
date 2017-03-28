/**
 * file: Lab5_prob1
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 5 Problem 7.31
 * due date: March 30, 2017
 * version: 1.8
 *
 * This file contains Lab 5 Problem 7.31 - Merging & Sorting 2 Lists
 */
import java.util.Scanner;
import java.util.Arrays;

public class Lab5_prob2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter list1: ");
    int[] list1 = new int[input.nextInt()];
    for (int p = 0; p < list1.length; p++) {
      list1[p] = input.nextInt();  //input values
    }
    
    System.out.print("Enter list2: ");
    int[] list2 = new int[input.nextInt()];
    for (int q = 0; q < list2.length; q++) {
      list2[q] = input.nextInt();  //input values
    }
    
    int[] finalList = merge(list1, list2);
    
    System.out.print("Your merged list is: ");
    for (int e: finalList) {
      System.out.print(" " + e);
    }
    System.out.println();
    
  }
 
  public static int[] merge(int[] list1, int[] list2) {
    int x = list1.length + list2.length;  //declaring list3
    int[] finalList = new int[x];
    
    for (int p = 0; p < list1.length; p++) { //places each value of list1 onto final list
      finalList[p] = list1[p];
    }
    
    for (int p = 0, q = list1.length; p < list2.length; p++, q++) {  //places each value of list2 onto final list
      finalList[q] = list2[p];
    }
    
    java.util.Arrays.sort(finalList);  //auto sort final list
    
    return finalList;
    
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    

 