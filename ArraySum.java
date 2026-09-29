import java.util.*;
public class ArraySum
{
 public static void main(String []args)
 {
  Scanner sc = new Scanner(System.in);
  int[] arr = new int[5];
  int sum = 0;
  for(int i=0; i<arr.length; i++)
  {
   arr[i]=in.nextInt();
   sum = sum + arr[i];
  }
  System.out.print("sum of all the array elements are: " +sum);
 }
}