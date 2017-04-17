/**
 * file: Lab7_prob1
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 5 Problem 10.17
 * due date: March 30, 2017
 * version: 1.8
 *
 * This file contains Lab 5 Problem 10.17 - Square Numbers  - 
 * Find first 10 square valued greater than Long.MAX_VALUE
 */
import java.math.BigInteger;

public class Lab7_prob3 {
  public static void main(String[] args) {
  
    BigInteger max = new BigInteger(Long.MAX_VALUE + "");  
    BigInteger x = max.add(new BigInteger("10"));  //adding 10 values to the maxValue
  
    for (max = new BigInteger(Long.MAX_VALUE + ""); max.compareTo(x) <= 0; max = max.add(new BigInteger("1"))) {
      BigInteger squared = max.multiply(max);        //squaring each value
      System.out.println(squared);                            //display results
    }
  }
}
