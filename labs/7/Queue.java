/**
 * file: Lab7_prob1
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 5 Problem 10.10
 * due date: April 20, 2017
 * version: 1.8
 *
 * This file contains Lab 5 Problem 10.10 - The Quene class - Follow Stack format
 */
public class Queue {
  private int[] elements;
  private int size;                                       //data fields
  public static final int DEFAULT_CAPACITY = 8;   
  
  public Queue() {
    elements = new int[DEFAULT_CAPACITY];
  }
  
  public void enqueue(int v) {               //adds v (same as new integer in stack)
    if (size >= elements.length) {
     int[] temp = new int[elements.length * 2];
     System.arraycopy(elements, 0, temp, 0, elements.length);
     elements = temp;
    }
    elements[size++] = v;
  }
  
  public int dequeue() {       //removes and returns element
    int v = elements[0]; //set as first element
    size--;
    for (int i = 0; i < size; i++) {
      elements[i] = elements[i + 1];
    }
    return v; 
  }
  
  public boolean empty() {         //check if queue is empty
    return size == 0;
  }
  
  public int getSize() {   //returns size of the queue
    return size;
  }
}


              //UML Class Diagram
/**---------------------------------------------*
|                  Queue                        |
|-----------------------------------------------|
| elements: int[]                               |
|                                               |
| size: int                                     |
|                                               |
| Quene()                                       | 
|                                               |
| enqueue(v: int)                               |
|                                               |
| dequeue(): int                                |
|                                               |
| empty(): boolean                              |
|                                               |
| getSize(): int                                |
|-----------------------------------------------|
*/

