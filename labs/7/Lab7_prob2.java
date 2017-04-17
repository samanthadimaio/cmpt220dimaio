/**
 * file: Lab7_prob1
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 5 Problem 10.10
 * due date: April 20, 2017
 * version: 1.8
 *
 * This file contains Lab 5 Problem 10.10 - The Quene class
 */
 public class Lab7_prob2 {
   public static void main (String[] args) {
   
     Queue queue = new Queue();  //create instance
     
     for (int i = 1; i <= 20; i++) {
       queue.enqueue(i);                 //adding 20 numbers
     }  
     
     for (int i = 0; i < 20; i ++) {
       System.out.print(queue.dequeue() + " ");     //removes and displays elements
     }
     System.out.println();
  }
}
     