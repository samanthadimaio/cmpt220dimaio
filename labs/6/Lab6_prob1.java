/**
 * file: Lab6_prob1.java
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 6 Problem 9.1 Class
 * due date: April 20, 2017
 * version: 1.8
 *
 * This file contains Lab 6 Problem 9.1 - Creating Rectangle Objects
 */
public class Lab6_prob1 {
  public static void main(String[] args) {
    Rectangle rec1 = new Rectangle(4, 40); //create rectangle object
    
    System.out.println("The width of Rectangle 1 is: " + rec1.width);   //width
    System.out.println("The height of Rectangle 1 is: " + rec1.height);  //height
    System.out.println("The area of Rectangle 1 is: " + rec1.getArea());    //area
    System.out.println("The perimeter of Rectangle 1 is: " + rec1.getPerimeter()); //perimeter
    System.out.println();
    
    Rectangle rec2 = new Rectangle(3.5, 35.9); //create rectangle object
    
    System.out.println("The width of Rectangle 2 is: " + rec2.width);   //width
    System.out.println("The height of Rectangle 2 is: " + rec2.height);  //height
    System.out.println("The area of Rectangle 2 is: " + rec2.getArea());    //area
    System.out.println("The perimeter of Rectangle 2 is: " + rec2.getPerimeter()); //perimeter
  }
}