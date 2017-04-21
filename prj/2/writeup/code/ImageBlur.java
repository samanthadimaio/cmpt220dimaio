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

  private BufferedImage image; // class variable 
  
  private float elements = 
  
  public static void main(String[] args) { //main method
    System.out.println("Welcome to Image Expression!");
    
    //create object instance for setting up the window frame
    //ask user for dimensions of their image
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the width of the image: ");
    int w = input.nextInt();                                
    System.out.print("Enter the height of the image: ");
    int h = input.nextInt();
    
    Frame window = new Frame("ImageBlur");     //Calling Frame class from Applet 
    window.add("Center", new ImageBlur()); //
    window.setSize(new Dimension(w,h));   //
    window.setVisible(true);  //method takes in boolean value to set Frame visible or not
  }    
  
  public ImageBlur() {   //constructor
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
    

    BufferedImage blur = new BufferedImage(image.getHeight(this), image.getHeight(this), BufferedImage.TYPE_INT_RGB); //make new buffered image for the blur
                                         //use convolve op? & kernel methods to blur image
                                         
    Kernel k = new Kernal(0, 0, elements) //figure out width and height to use for kernel method
    ConvolveOp convolve = new ConvolveOP(k) //convolve method takes in the kernel     
    //find method to apply convolveOP
    
    System.out.println("If you would like your image to have SUPER blur, enter 1");
    int superBlur = input.nextInt()
    
    if (superBlur == 1)
      //to get super blur -- make a for loop that will change the pixels
      
    //draw image again?
    //load the blurred image
    //create adding text feature
    //create desired blur amount feature
  }
  
}

