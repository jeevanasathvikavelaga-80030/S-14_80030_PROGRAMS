import java.lang.*;
public class Vote
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("enter your age:");
int age= sc.nextInt();
if(age>=18)
System.out.println("the person is eligible of voting");
else
System.out.println("the person is not eligible of voting");
}
}
