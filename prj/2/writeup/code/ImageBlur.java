/**
 * file: ImageBlur.java
 * author: Samantha DiMaio
 * course: CMPT 220
 * assignment: Semester Project
 * due date: May 10 2017
 * version: 1.8
 *
 * This file contains the java source code to Image Expression 
 * Image Expression blurs a desired image and asks the user to input a text onto the image
 */

//import packages
import java.util.Scanner;
import java.awt.*
import java.awt.image.*

//had to import packages that reads/loads image file
import java.io.*;         //File()
import javax.imageio.*;   //imageIO


public class ImageBlur extends Object() //subclass of Java's Object 

  private BufferedImage image; // class variable 

  float[] elements = { .1111f, .1111f, .1111f, 
                         .1111f, .1111f, .1111f,   //elements for convolution
                         .1111f, .1111f, .1111f};
                         
  public static void main(String[] args) { //main method
    //create object instance for setting up the window frame
    //ask user for dimensions of their image
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the width of the image: ");
    int w = input.nextInt();
    System.out.println("Enter the height of the image: ");
    int h = input.nextInt();
    
    Frame window = new Frame("ImageBlur");
    f.setSize(new Dimension(w,h));
    f.setVisible(true);  //method takes in boolean value to set Frame visible or not
    
  }
  
  public ImageBlur() { //constructor 
    Scanner input = new Scanner(System.in);
    
    setBackground(color.black) // insert optional background color? 
    
    BufferedImage pic = null;
    
    System.out.print("Enter the file name of your image: ") //ask user for file !name! of image 
    String name = input.next()
    
    try {
      pic = ImageIO.read(new File(name));
    }                                         //reading the image file  	,      
    catch (IOException e) {
    }
    
    image = new BufferedImage(img.getWidth(this), img.getHeight(this), //type?)
         
    //draw the original image
  }
  
  public void create(Graphics g) { //method to design image

    //load the blurred image
    //create adding text feature
    //create desired blur amount feature
  }
