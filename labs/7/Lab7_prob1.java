/**
 * file: Lab7_prob1
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 5 Problem 9.
 * due date: March 30, 2017
 * version: 1.8
 *
 * This file contains Lab 5 Problem 9.13 - Instances of the BMI class
 */
public class Lab7_prob1 {
  public static void main(String[] args) {
    BMI bmi1 = new BMI ("Kim Yang", 18, 145, 5, 9); //70 inches goes to 5 feet 9 inches
    System.out.println("The BMI for "+ bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
    
    BMI bmi2 = new BMI ("Susan King", 215, 70); //stays the same as before
    System.out.println("The BMI for "+ bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
  }
}