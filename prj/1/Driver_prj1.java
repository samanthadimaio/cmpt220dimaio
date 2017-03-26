/**
 * file: Driver_prj1.java
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: project 1: CONVOLUTION
 * due date: March 30, 2017
 * version: 1.8
 *
 * This file contains project 1: CONVOLUTION
 */
import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int k = input.nextInt();
    int i = input.nextInt();
    int x;

    double[] vFirst = new double[k];    //declare vectors
    double[] vSecond = new double[i];
    
    for (x = 0; x < k; x++) {
      vFirst[x] = input.nextDouble();  //input values
    }
    
    for (x = 0; x < i; x++) {
      vSecond[x] = input.nextDouble();
    }
    
    double[] result = convolveVectors(vFirst, vSecond);
    
    for (x = 0; x < result.length; x++) {
      System.out.print((Math.round(result[x])) + " ");
    }
    System.out.println();
    
  }
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    for (int k = 0; k < vResult.length; k++) {
      vResult[k] = 0;
      for (int i = 0; i < vSecond.length; i++) {
        if ((k - i >= 0) && (k - i < vFirst.length)) {
          vResult[k] += vFirst[(k - i)] * vSecond[i]; 
        }
      }
    }  
    return vResult; 
  }
}