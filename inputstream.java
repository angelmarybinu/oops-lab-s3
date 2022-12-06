import java.io.*;
import java.util.Scanner;
public class inputstream
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream r=new FileInputStream("angel.txt");
            int i=0;
            while((i=r.read())!=-1)
                {
                    System.out.print((char)i);
                }
            System.out.println();
            FileOutputStream w=new FileOutputStream("angel.txt");
            System.out.println("Enter the contents of file");
            Scanner s=new Scanner(System.in);
            String str=s.nextLine();
            byte b[]=str.getBytes();
            w.write(b);
            System.out.println("Updated");
            r.close();
            w.close();
        }
        catch(FileNotFoundException e)
            {
                System.out.println(e);
            }
        catch(IOException e)
            {
                System.out.println(e);
            }
    }
}
