import java.util.Scanner;
public class quicksortnames1
{
    int partition(String str[],int low,int high)
    {   int left,right;
        String temp;
        String pivot=str[low];
        left=low;
        right=high;
        while(left<right)
             {
                while(str[left].compareToIgnoreCase(pivot)<=0)
                     left++;
                while(str[right].compareToIgnoreCase(pivot)>0)
                     right--;
                if(left<right)
                   {temp=str[left];
                   str[left]=str[right];
                   str[right]=temp;
                   }
             }
             str[low]=str[right];
             str[right]=pivot;
             return right;
        
    }
void sort(String str[],int low,int high)
    {
        if(low<high)
        {
            int pi=partition(str,low,high);
            sort(str,low,pi-1);
            sort(str,pi+1,high);
        }
    }
    static void print(String str[],int n)
    {
        for(int i=0;i<n;++i)
           System.out.println(str[i]);
        System.out.println();
    }
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    String str[]=new String[30];
    int n,i;
    System.out.println("Enter the number of names");
    n=s.nextInt();
    n=n+1;
    System.out.println("Enter Names");
    for(i=0;i<n;i++)
       str[i]=s.nextLine();
    quicksortnames1 ob=new quicksortnames1();
    ob.sort(str,0,n-1);
    System.out.println("Sorted names:");
    print(str,n);
       
}
}