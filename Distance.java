import java.util.Scanner;
public class Distance
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);

   double speed, time, distance;

   System.out.print("Enter speed (km/h):");
   speed = sc.nextDouble();

   System.out.print("Enter time (hours):");
   time = sc.nextDouble(); 

   distance = speed * time;

   System.out.println("Speed="+ speed);
   System.out.println("Time="+ time);
   System.out.println("Distance traveled="+ distance);
  }
}




