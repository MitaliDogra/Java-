//declaring a 2d array
import java.util.Scanner;
public class Arr{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[][] array= new int [2][3];
        int r,c;
        for(r=0;r<2;r++){
            for (c=0;c<3;c++){
                array[r][c]=s.nextInt();
                
            }
        }
        
        
        
    }
} 