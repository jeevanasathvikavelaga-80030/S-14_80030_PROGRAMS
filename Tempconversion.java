import java.util.Scanner;
public class Tempconversion
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter temperature in Fahrenheit: ");
  float Fahrenheit = sc.nextFloat();
 
  float Celsius = (Fahrenheit - 32)*5/9 ;

  System.out.println("Temperature in Celsius: " + Celsius);
 }
}
