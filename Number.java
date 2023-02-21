import java.util.Scanner;
public class Number{
 public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter first number: ");
   int num1 = scan.nextInt();
   System.out.println("Enter second number: ");
   int num2 = scan.nextInt();
   if (num1 > num2) {
     System.out.println("The greatest number is: " + num1);
   }
else if (num1==num2){
System.out.println("both are equal");}
else {
     System.out.println("The greatest number is: " + num2);
   }
 }
}
