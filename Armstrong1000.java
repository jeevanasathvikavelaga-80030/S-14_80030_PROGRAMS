import java.util.*;
public class Armstrong1000
{
 public static void main(String[] args)
 {
  for (int num = 1; num <= 1000; num++)
  {
   int sum = 0;
   int n = num;
   int tnum = n;

   while (n > 0)
   {
    int digit = n % 10;
    sum = sum + (digit * digit * digit);
    n = n / 10;
   }

   if (sum == tnum)
   {
   System.out.println(tnum + " is an Armstrong number");
   }
  }
 }
}


