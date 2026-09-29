import java.lang.*;
public class Eligible
{
public static void main(String args[])
{
int marks=80/100;
int telugu = 85;
int hindi = 52;
int english = 24;
int math = 72;
int science = 85;
int social= 46;
int total = telugu + hindi + english + math + science + social;
int percentage= total/600;
System.out.println(percentage >= marks);
}
}
