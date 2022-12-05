import java.util.*;
public class frequency
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i,count=0;
        String str,ch;
        System.out.println("Enter a string");
        str=s.nextLine();
        System.out.println("Enter the character");
        ch=s.next();
        for(i=0;i<str.length();i++)
            {if(str.charAt(i)==ch.charAt(0))
              count++;
            }
        System.out.println(ch+" occurs "+count+" times " );


    }
}
