import java.util.*;
class Jagged
{
public static void main(String args[])
{
    int r,c;
Scanner s = new Scanner(System.in);
System.out.println("Enter the elements of matrix");
int a[][] = new int [3][];
a[0]= new int [3];
a[1]= new int [2];
a[2]= new int [4];
for ( r= 0 ; r< 3 ; r++ )
    for ( c= 0 ; c < a[r].length ;c++ )
        a[r][c] = s.nextInt();
        

for ( r= 0 ; r< 3 ; r++ )
{
for ( c= 0 ; c < a[r].length ;c++ )
{ 
    System.out.print(a[r][c]+"\t");
}
System.out.println();

}
}
}