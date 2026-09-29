import java.util.*;
public class Search
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  int[] arr = new int[5];
  System.out.print("Array: ");
  for(int i = 0; i < 5; i++)
  {
   arr[i] = sc.nextInt();
  }
   System.out.print("Search: ");
   int key = sc.nextInt();
   for(int i = 0; i < 5; i++)
   {
    if(arr[i] == key)
    {
     System.out.println(key + " found at index " + i);
     break;
    }
   }
  }
}