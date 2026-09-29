import java.util.*;
public class EvenOddCount
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter 5 numbers:");
  int[] arr = new int[5];
  for(int i = 0; i < arr.length; i++)
  {
   arr[i] = sc.nextInt();
  }
   int even = 0;
   int odd = 0;
   for(int i = 0; i < arr.length; i++)
   {
    if(arr[i] % 2 == 0)
    {
     even++;
    }
    else
    {
    odd++;
   }
  }
  System.out.println("Even numbers count = " + even);
  System.out.println("Odd numbers count = " + odd);
 }
}