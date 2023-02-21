import java.util.*;
public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i;
        int f=1;
        for(i=1;i<=a;i++){
            f=f*i;
        }
        System.out.println(f);
    }
}