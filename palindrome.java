import java.util.*;
public class palindrome
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        String str;
        System.out.println("Enter a string");
        str=s.nextLine();
        int palindrome=1;
        int i,j;
        for(i=0,j=str.length()-1;i<j;i++,j--)
           {
            if(str.charAt(i)!=str.charAt(j))
              {
                palindrome=0;
                break;
              }
           }
        if(palindrome==1)
         {
            System.out.println("Palindrome");
         }
        else
         {
            System.out.println("not Palindrome");
            
         }
    }
}