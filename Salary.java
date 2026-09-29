import java.util.Scanner;
public class Salary
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   
   double BasicSalary, HRA, DA, Netsalary;
 
   System.out.print("Enter BasicSalary:");
   BasicSalary = sc.nextDouble();
   
   HRA = 20.0 / 100 * BasicSalary;
   DA  = 10.0 / 100 * BasicSalary;

   Netsalary = BasicSalary + HRA + DA;

   System.out.println("Basic Salary ="+BasicSalary);
   System.out.println("HRA =" + HRA);
   System.out.println("DA =" + DA);
   System.out.println("Net salary ="+Netsalary);
  }
}




   