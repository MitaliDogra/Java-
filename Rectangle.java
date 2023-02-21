import java.util.Scanner;
          public class Rectangle{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter length of rectangle: ");
    int length = scan.nextInt();
    System.out.println("Enter breadth of rectangle: ");
    int breadth = scan.nextInt();
    if (length == breadth) {
      System.out.println("The rectangle is a square.");
    } else {
      System.out.println("The rectangle is not a square.");
    }
  }
}
