/**
 * file: Lab5_prob1
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 5 Problem 7.32
 * due date: March 30, 2017
 * version: 1.8
 *
 * This file contains Lab 5 Problem 7.32 - Partition of a list
 */
import java.util.Scanner;

public class Lab5_prob3 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    System.out.print("Enter list: ");
    int[] list = new int[input.nextInt()];
    for (int p = 0; p < list.length; p++) {
      list[p] = input.nextInt();  //input values
    }
    
    partition(list);
    
    System.out.print("Partitioned list: ");
    for (int e: list) {
      System.out.print(" " + e);
    }
    System.out.println();
  }
    
    
  public static int partition(int[] list) {
    int index = 0;
    int first = index + 1;
    int last = list.length - 1;
    int pivot = list[index];
    int x;
      
         
    while (first < last) {
      while (first <= last && list[first] <= pivot) first++;  //comparing elements to pivot
      while (first <= last && list[last] > pivot) last--;
      
      if (first < last) {
        x = list[last];
        list[last] = list[first];
        list[first] = x;              //element swaps
      }
    }
    
    while (last >= first && list[last] >= pivot) last--;  //comparing elements to pivot
    
      if (index < last) {
        x = list[last];
        list[last] = list[index];  //element swaps 
        list[index] = x;
        return last;
      }
      else {
        return index;
      }
  }
}

      
    
      