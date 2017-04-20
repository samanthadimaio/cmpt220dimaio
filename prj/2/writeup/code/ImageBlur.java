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
import java.awt.*;
import java.awt.image.*;

//had to import packages that reads/loads image file
import java.io.*;         //File()
import javax.imageio.*;   //imageIO
import java.applet.Applet;

public class ImageBlur extends Applet { //subclass of Java's Object ----> Component

  BufferedImage image; // class variable 

  float[] elements = { .1111f, .1111f, .1111f, 
                       .1111f, .1111f, .1111f,   //elements for convolution
                       .1111f, .1111f, .1111f};
  
  public static void main(String[] args) { //main method
    //create object instance for setting up the window frame
    //ask user for dimensions of their image
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the width of the image: ");
    int w = input.nextInt();
    System.out.print("Enter the height of the image: ");
    int h = input.nextInt();
    
    Frame window = new Frame("ImageBlur");
    window.add("Center", new ImageBlur());
    window.setSize(new Dimension(w,h));
    window.setVisible(true);  //method takes in boolean value to set Frame visible or not
  }    
  
  public ImageBlur() {
    Scanner input = new Scanner(System.in);

    setBackground(Color.pink); //set Background color to pink... make optional?
    
    System.out.print("Enter the file name of your image: "); //ask user for file !name! of image 
    String name = input.next();   
        
    try {
      image = ImageIO.read(new File(name));                   
    } catch (IOException e) {
    }
    
    image.drawImage(image, 0, 0, this); //drawing original image           
  }
  
  public void create(Graphics g) { //method to design image
    g.drawImage(image, 0, 0, null);
    
    //make new buffered image for the blur 
    BufferedImage blur = new BufferedImage(image.getHeight(this), image.getHeight(this), BufferedImage.TYPE_INT_RGB);
    
    
    //use convolve op? & kernal methods to blur image
    //figure out what method to use to apply the methods
    
    //draw image again?
    //load the blurred image
    //create adding text feature
    //create desired blur amount feature
  }
  
}

