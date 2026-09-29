import java.util.*;
public class Fibonacci4
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number:");
  int n = sc.nextInt();
  int a = 0, b = 1;

  for(int j = 1; j <= n; j++)
  {
   System.out.print(a + " ");

   int c = a + b;
       a = b;
       b = c;
  }
 }
}



