import java.io.*;
public class readerwriter
{
    
    
    public static void main(String args[])
    {
        try
        {
            Reader r=new FileReader("angel.txt");
            int ch;
            ch=r.read();
            while(ch!=-1)
                {
                    System.out.print((char)ch);
                    ch=r.read();
                }
            System.out.println();
            r.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            Writer w=new FileWriter("angel.txt");
            String s="new";
            w.write(s);
            w.close();
            System.out.println("File return");
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
        
    }
}