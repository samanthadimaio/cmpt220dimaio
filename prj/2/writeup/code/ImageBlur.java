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

  private BufferedImage image;                               // class variables
  
  private float[] elements = {.1111f, .1111f, .1111f, 
                              .1111f, .1111f, .1111f,
                              .1111f, .1111f, .1111f};  
  
  public static void main(String[] args) {       //main method
    System.out.println("Welcome to Image Expression!");
    System.out.println("----------------------------");
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("What color would you like as your background?");
    System.out.println("Type in: black, white, cyan, red, pink, yellow, green, blue, or orange:  ");
    String color = input.next();
    Color choice = new Color(0,0,0);
    
    switch (color.toLowerCase()) {
     case "cyan": choice = Color.cyan; break;
     case "pink": choice = Color.pink; break;
     case "white": choice = Color.white; break;
     case "red": choice = Color.red; break;               //make switch statements for color of background
     case "black": choice = Color.black; break;
     case "yellow": choice = Color.yellow; break;
     case "green": choice = Color.green; break;
     case "blue": choice = Color.blue; break;
     case "orange": choice = Color.orange; break;
    }

    System.out.print("Enter the width of the window: ");   
    int w = input.nextInt();                                 //ask user for dimensions of their image       
    System.out.print("Enter the height of the window: ");
    int h = input.nextInt();
    
    
    Frame window = new Frame("ImageBlur");     //Calling Frame class from Applet 
                                              //create object instance for setting up the window frame
    window.setBackground(choice);          //calling color class to set color
    window.add("Center", new ImageBlur()); //
    window.setSize(new Dimension(w,h));   //
    window.setVisible(true);  //method takes in boolean value to set Frame visible or not
  }    
  
  public ImageBlur() {   //constructor of ImageBlur class
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the file name of your image: "); //ask user for file !name! of image 
    String name = input.next();   
    
    BufferedImage pic = null;
    
    try {
      pic = ImageIO.read(new File(name));                   
    } catch (IOException e) {
    }
    
    image = new BufferedImage(pic.getWidth(this), pic.getHeight(this), BufferedImage.TYPE_INT_RGB); //creating Buffered Image with width and height
    Graphics2D x = image.createGraphics();  //creates image & enables drawing on image 
    
    x.drawImage(pic,0,0,this); //drawing original image (pic) with conditions of image 
  }
  
  public void paint(Graphics g) { //PAINT method must be used to design image using the Graphics class 
    
    BufferedImage blur = new BufferedImage(image.getWidth(this), image.getWidth(this),BufferedImage.TYPE_INT_RGB); //make new buffered image for the blur

    Scanner input = new Scanner(System.in);
    System.out.println("If you would like your image to have SUPER blur, enter 1, if not enter 2: ");
    int superBlur = input.nextInt();
    
    Kernel k = new Kernel(0, 0, elements); 
    
    if (superBlur == 1) {
      elements = new float[400];                                        
      for (int i = 0; i < 400; i++)        // puts extreme blur 
        elements[i] = 1.0f/400.0f;      //to get super blur -- make a for loop that will change the pixels
    
      k = new Kernel(20, 20, elements);
    }
    
    else {
      k = new Kernel(3, 3, elements);
    }
    
    ConvolveOp c = new ConvolveOp(k);
    c.filter(image, blur);

    Graphics2D create = (Graphics2D) g;
    create.drawImage(blur, 0, 0, this);
    
    //draw image again?
    //create adding text feature
    //use Graphics2D & draw string method
  }

}
