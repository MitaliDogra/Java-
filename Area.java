
/*3. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of the rectangle are entered through the keyboard. */

import java.util.Scanner;

public class Area{ 
    public float returnArea(  float l, float b){
        return l*b;
    }
    public static void main(String [] args) {

       Scanner my=new Scanner(System.in);
       System.out.println("enter the length and the breadth (any number you like ):");
        float l= my.nextFloat();
         float b=my.nextFloat();
       System.out.println("the length is "+ l);
       System.out.println("the breadth is "+ b);

        Area obj=new Area();
       System.out.println("the area is  " +obj.returnArea(l,b));
        
        
        
        

    }
   

}