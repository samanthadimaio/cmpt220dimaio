/**
 * file: Rectangle
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Lab 6 Problem 9.1 Class
 * due date: April 20, 2017
 * version: 1.8
 *
 * This file contains Lab 6 Problem 9.1 - creating Rectangle class
 */
 
class Rectangle {

  double width = 1;    //width and height of rectangle
  double height = 1; 
  
  Rectangle() {   //no-arg constructor
  }
  
  Rectangle(double newWidth, double newHeight) { //create rectangle
    width = newWidth;
    height = newHeight;
  }
  
  double getArea() {         //formula for area of rectangle
    return width * height;
  }
  
  double getPerimeter() {
    return (width * 2) + (height * 2); //formula for perimeter of rectangle
    
  }
  
              //UML Class Diagram
/**---------------------------------------------*
|                  Rectangle                    |
|-----------------------------------------------|
| width: double                                 |
|                                               |
| height: double                                |
|                                               |
| Rectangle()                                   | 
|											    |
| Rectangle(newWidth: double, newHeight: double)|
|                                               |
| getArea(): double                             |
|                                               |
| getPerimeter(): double                        |
|-----------------------------------------------|
*/
}
  
  