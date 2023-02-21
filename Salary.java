import java.util.Scanner;
public class Salary {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your salary: ");
    int salary = scan.nextInt();
    System.out.println("Enter your years of service: ");
    int service = scan.nextInt();
    if (service > 5) {
      int bonus = (int) (salary * 0.05);
      System.out.println("Net bonus amount: " + bonus);
    } else {
      System.out.println("Sorry, you are not eligible for a bonus.");
    }
  }
}
