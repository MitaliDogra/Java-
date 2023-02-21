
/* Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.*/


public class Triangle {
    int a=3,b=4,c=5;
    
    int s= a+b+c;
    int ar= (s*(s-a)*(s-b)*(s-c))^1/2;


    public static void main(String[] args){
        Triangle obj= new Triangle();
        int x=obj.s;
        int y=obj.ar;
        System.out.println("area is " + y +" "+ "perimeter is " + x);

        System.out.println("aditya malhotra 22csu297");
    }

    
}
