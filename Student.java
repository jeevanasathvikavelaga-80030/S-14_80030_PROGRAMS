import java.util.Scanner;
public class Student
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);

  String name;
  int rollNo, age, m1, m2, m3, m4, m5, total;
  double average;

  System.out.print("Enter name: ");
  name = sc.nextLine();

  System.out.print("Enter roll no: ");
  rollNo = sc.nextInt();

  System.out.print("Enter age: ");
  age = sc.nextInt();

  System.out.print("Enter m1: ");
  m1 = sc.nextInt();

  System.out.print("Enter m2: ");
  m2 = sc.nextInt();

  System.out.print("Enter m3: ");
  m3 = sc.nextInt();
 
  System.out.print("Enter m4: ");
  m4 = sc.nextInt();
 
  System.out.print("Enter m5: ");
  m5 = sc.nextInt();

  total = m1 + m2 + m3 +m4 + m5;
  average = total / 5;
 
  System.out.println("AVERAGE: " + average);

  if (average >= 90)
  {
   System.out.println("Grade = O");
  }
  else if (average >= 80)
  {
   System.out.println("Grade = A");
  }
  else if (average >= 70)
  {
   System.out.println("Grade = B");
  }
  else if (average >= 60)
  {
   System.out.println("Grade = C");
  }
  else if (average >= 50)
  {
   System.out.println("Grade = D");
  }
  else
  {
   System.out.println("Fail");
  }

  System.out.println("--> Student Information <--");
  System.out.println("Student Name = " + name);
  System.out.println("Roll No = " + rollNo);
  System.out.println("Age = " + age);
  System.out.println("Subject 1 = " + m1);
  System.out.println("Subject 2 = " + m2);
  System.out.println("Subject 3 = " + m3);
  System.out.println("Subject 4 = " + m4);
  System.out.println("Subject 5 = " + m5);
  System.out.println("Total = "+ total);
  System.out.println("Average = " + average);
 }
}






  
          
