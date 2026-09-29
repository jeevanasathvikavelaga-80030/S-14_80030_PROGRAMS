import java.util.*;
public class Armstrong
{ 
 public static void main(String []args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number:");

  int n = sc.nextInt(); 

  int sum = 0;
  int tnum = n;

  while (n > 0)

  {
   int digit = n % 10;
   sum = sum + (digit * digit * digit);
   n = n / 10;
  }

  if (sum == tnum)

  { 
  System.out.println(tnum+ " is an Armstrong number");
   }
    else
   {
  System.out.println(tnum+ " is not an Armstrong number");
   }
 }
}



  

