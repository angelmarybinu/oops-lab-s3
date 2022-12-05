import java.util.*;
class employee
{
    String name;
    int age;
    int phno;
    String address;
    int salary;
    void printsalary()
    {
        System.out.println(+salary);
    }
}
class officer extends employee
{
    String specialization;
    String department;
    void printall()
    {
      System.out.println("Name:"+name);
      System.out.println("Age:"+age);
      System.out.println("Phone number:"+phno);
      System.out.println("Address:"+address);
      System.out.println("Salary:"+salary);
    }
}
class manager extends employee
{
    String specialization;
    String department;
    void printall()
    {
      System.out.println("Name:"+name);
      System.out.println("Age:"+age);
      System.out.println("Phone number:"+phno);
      System.out.println("Address:"+address);
      System.out.println("Salary:"+salary);
    }
}
public class inheritance
{
    public static void main(String args[])
    {
        officer o=new officer();
        o.name="Angel";
        o.age=19;
        o.phno=1234;
        o.address="India";
        o.salary=5000;
        o.printsalary();
        o.printall();
        
        manager m=new manager();
        m.name="Mary";
        m.age=19;
        m.phno=4321;
        m.address="America";
        m.salary=4000;
        m.printsalary();
        m.printall();



    }
}