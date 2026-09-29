import java.util.*;
public class Fibonacci
{ 
 public static void main(String[]args)
 {
  int i = 8;
  int a = 0, b = 1;

  for(i = 1 ; i <= 8; i++)
  {
   System.out.println(a +" ");

   int c = a + b;
   a = b;
   b = c;
  }
 }
}
