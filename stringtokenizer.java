import java.util.*;
public class stringtokenizer
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int sum=0;
        String temp;
        String str;
        System.out.println("Enter a line of integers");
        str=s.nextLine();
        StringTokenizer str1=new StringTokenizer(str," ");
        while(str1.hasMoreTokens())
        {
            temp=str1.nextToken();
            Integer n=Integer.parseInt(temp);
            System.out.println(n);
            sum=sum+n;
        }
        System.out.println("Sum is "+sum);
    }
}