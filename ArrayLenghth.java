import java.util.Scanner;
public class ArrayLenghth
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the numbers: ");
  int[] arr = new int[]

  for (int i = 0; i < n; i++)
  {
   arr[i] = sc.nextInt();
  }
   for (int j = n; j >= 0; j--)
  {
    System.out.println(arr[j]);
  }
 }
} 
