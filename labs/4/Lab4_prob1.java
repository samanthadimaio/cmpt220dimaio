/**
 * file: Lab4_prob1.java
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 4: Problem 6.8
 * due date: March 9, 2017
 * version: 1.8
 *
 * This file contains the program for Lab 4 -  Problem 6.8 - Conversions between Celsius and Fahrenheit
 */
public class Lab4_prob1 {

  public static void main(String[] args) {
  
    double celsius = 40.0;
    double fahrenheit = 120.0; 
  
    System.out.println(
            "Celsius    Fahrenheit    |  Fahrenheit   Celsius\n" +
            " ----------------------------------------------------");
          
    while ((celsius <= 40.0) && (celsius >= 31.0) && (fahrenheit <= 120.0) && (fahrenheit >= 30.0)) {
      System.out.printf("%-12.1f", celsius); //used -12 to determine spaces & .1 for decimal placement
      System.out.printf("%11.1f  |", celsiusToFahrenheit(celsius));
      System.out.printf("    %-15.1f", fahrenheit);
      System.out.printf("%-7.2f\n", fahrenheitToCelsius(fahrenheit));
      celsius --;
      fahrenheit -= 10;
    }
  }
    
  public static double celsiusToFahrenheit(double celsius) {
    return (9.0 / 5) * celsius + 32; 
  }
  
  public static double fahrenheitToCelsius(double fahrenheit) {
    return (5.0 / 9) * (fahrenheit - 32); 
  }
}
 
 