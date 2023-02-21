import java.io.* ;
class Ab{
 public static void main(String args[])
 {
 StringBuffer sb = new StringBuffer("Hello ");
 sb.append("Java"); // now original string is changed
 sb.delete(1,3);
 sb.replace(1,3,"abc");
 sb.reverse();
 System.out.println(sb);
 }
}
