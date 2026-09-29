import java.util.*;
public class Maximum2
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value of a");
  int a = sc.nextInt();
  System.out.println("Enter the value of b");
  int b = sc.nextInt();
  System.out.println("Enter the value of c");
  int c = sc.nextInt();
  int max = (a > b) ? a : b;
  max = (max > c) ? max : c;
// result =((a > b) ? (a > c)? a : c : (b > c) ? b : c);

 System.out.println("the max number of three numbes is " +max);
 }
}

 