/**
 * file: Location.java
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 6 Problem 9.13
 * due date: April 19 2017
 * version: 1.8
 *
 * This file contains Lab 5 Problem 7.13 - Creating Location Class
 */
class Location {
  int row;
  int column;        //public data fields
  double maxValue;
  
  Location() {  //constructor
  }
  
  Location(double[][] a) {    //returns largest element in array
    row = 0;
    column = 0;
    maxValue = a[0][0];
    
    for (int x = 0; x < a.length; x++) {
      for (int y = 0; y < a[x].length; y++) {
        if (a[x][y] > maxValue) {                          
          row = x;
          column = y;
          maxValue = a[x][y];
        }
      }
    }
  }
  
  public static Location locateLargest(double[][] a) {
    return new Location(a);
  }
  
}


