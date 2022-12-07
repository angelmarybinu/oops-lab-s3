import java.util.*;
import java.lang.String;
public class exceptionhandling
{
  static void calculate()
  {
    try
    {
    int d=5;
    int c=0;
    int a=d/c;
    }
    catch(ArithmeticException e)
    {
        System.out.println("Arithmetic exception thrown");
        System.out.println(e.getMessage());
    }

  } 
  static void vote(int age)
  {
    if(age<18)
      throw new ArithmeticException("Cannot vote");
    else
      System.out.println("Can vote");
  }
  public static void main(String args[])throws InterruptedException
  { Scanner s=new Scanner(System.in);
    int age;
    calculate();
    System.out.println("Enter your age");
    age=s.nextInt();
    vote(age);
    Thread.sleep(1000);


  } 
}
