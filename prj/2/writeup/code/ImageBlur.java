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
                              .1111f, .1111f, .1111f};  //blur matrix 
                              
  private float[] elements1 = {-1.0f, -1.0f, -1.0f, 
                               -1.0f, 8.0f, -1.0f,    //edge detection matrix
                               -1.0f, -1.0f, -1.0f};
  
  private float[] elements2 = {-2.0f, -1.0f, 0.0f,
                               -1.0f, 1.0f, 1.0f,  //sharpen matrix
                               0.0f, 1.0f, 2.0f};
 
  public static void main(String[] args) {       //main method all about the window
    System.out.println("Welcome to Image Expression!");
    System.out.println("----------------------------");
    System.out.println();
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("What color would you like as your background?");
    System.out.println("Type in: black, white, cyan, red, pink, yellow, green, blue, or orange:  ");
    String color = input.next();
    System.out.println();
    Color choice = new Color(0,0,0);
    
    switch (color.toLowerCase()) {
      case "cyan": choice = Color.cyan; break;
      case "pink": choice = Color.pink; break;
      case "white": choice = Color.white; break;
      case "red": choice = Color.red; break;          //make switch statements for color of background
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
    System.out.println();
    

    Frame window = new Frame("ImageBlur");     //Calling Frame class from Applet 
                                            //create object instance for setting up the window frame
    window.setBackground(choice);           //calling color class to set color
    window.add("Center", new ImageBlur()); 
    window.setSize(new Dimension(w,h));   
    window.setVisible(true);  //method takes in boolean value to set frame visible or not
  }    
  
  public ImageBlur() {   //constructor of ImageBlur class
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the file name of your image: "); //ask user for filename of image 
    String name = input.next(); 
    System.out.println();  
    
    BufferedImage pic = null;
    
    try {
      pic = ImageIO.read(new File(name));       //enter filename of image(catches exception)            
    } 
    catch (IOException e) {
    }
    
    image = new BufferedImage(pic.getWidth(this), pic.getHeight(this), BufferedImage.TYPE_INT_RGB); //setting up dimensions of BI
    Graphics2D x = image.createGraphics();  //creates image & enables drawing on image 
    
    x.drawImage(pic,0,0,this); //drawing original image (pic) with conditions of image 
  }
  
  public void paint(Graphics create) { // paint method must be used to design image using the Graphics class 
    
    BufferedImage blur = new BufferedImage(image.getWidth(this), image.getWidth(this),BufferedImage.TYPE_INT_RGB); //make new BI for blurred image

    Scanner input = new Scanner(System.in);
    System.out.println("If you would like your image to have super blur, enter 1: ");
    System.out.println("If you would like your image to have light blur, enter 2: ");
    System.out.println("If you would like your image to have edge detection, enter 3: ");
    System.out.println("If you would like your image to be sharpened, enter 4: ");
    int filter = input.nextInt();
    System.out.println();
    
    Kernel k = new Kernel(0, 0, elements); 
    
    if (filter == 1) {
      elements = new float[400];                                        
      for (int i = 0; i < 400; i++)        // puts extreme blur 
        elements[i] = 1.0f/400.0f;      //to get super blur -- make a for loop that will change the pixels
    
      k = new Kernel(20, 20, elements);   //takes in kernel width, kernel height, float data
      
    }
    
    else if (filter == 2) {
      k = new Kernel(3, 3, elements);
    }
    
    else if (filter == 3) {        
      k = new Kernel(3, 3, elements1);
    }
    
    else if (filter == 4) {
      k = new Kernel(3, 3, elements2);
    }
    
    ConvolveOp c = new ConvolveOp(k);
    c.filter(image, blur);
    create.drawImage(blur, 0, 0, this);
    
    System.out.println("Enter your first name: ");
    String name = input.next();
    System.out.println();
    System.out.println("What color would you like as your text color?");
    System.out.println("Type in: white, cyan, red, pink, yellow, green, blue, or orange:  ");
    String color = input.next();
    System.out.println();
    Color choice = new Color(0,0,0);
    
    switch (color.toLowerCase()) {
      case "cyan": choice = Color.cyan; break;
      case "pink": choice = Color.pink; break;
      case "white": choice = Color.white; break;
      case "red": choice = Color.red; break;           //make switch statements for color of text
      case "yellow": choice = Color.yellow; break;
      case "green": choice = Color.green; break;
      case "blue": choice = Color.blue; break;
      case "orange": choice = Color.orange; break;
    }
    create.setColor(choice);
    create.setFont(new Font("TimesRoman", Font.PLAIN, 36));
    create.drawString(name, 20, 40);    
    
    System.out.println("Thank You For Expressing Your Image! Press 1 to exit:  ");
    int exit = input.nextInt();
    if (exit == 1) {                   //terminates the program
      System.exit(0);
    }     
  }
}