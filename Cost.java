import java.util.Scanner;

public class Cost{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the quantity: ");
    int quantity = scan.nextInt();
    int cost = quantity * 100;
    if (cost > 1000) {
      cost = cost - (cost / 10);
    }
    System.out.println("Total cost: " + cost);
  }
}
