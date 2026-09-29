import java.util.*;
public class Armstrongg
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a number:");
  int n = sc.nextInt();

  int num = n;
  int temp = n;
  int count = 0;

  while (temp > 0)
  {
   count++;
   temp = temp / 10;
  }
   int sum = 0;

   while (n > 0)
   {
    int digit = n % 10;
    sum = sum + (int)Math.pow(digit, count);
    n = n / 10;
   }

   if (sum == num)
   {
    System.out.println(num + " is an Armstrong number");
   }
    else
   {
    System.out.println(num + " is not an Armstrong number");
    }
   }
}
