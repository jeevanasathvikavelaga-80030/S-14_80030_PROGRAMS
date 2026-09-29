import java.util.*;
public class Maximum
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value of a");
  int a = sc.nextInt();
  System.out.println("Enter the value of b");
  int b = sc.nextInt();
  int c=a>b?a:b;

 System.out.println("the max number of two numbes is " +c);
 }
}

