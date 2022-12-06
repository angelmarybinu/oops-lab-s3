import java.util.Scanner;
public class binarysearch
{
    public static void search(int a[],int key,int first,int last)
    {
        int mid;
        mid=(first+last)/2;
        while(first<=last)
            {
              if(key==a[mid])
                 {System.out.println("Element found at "+(mid+1));
                  break;
                 }
              if(a[mid]<key)
                   first=mid+1;
              else
                  last=mid-1;
              mid=(first+last)/2;       
            
            }
        if(first>last)
          System.out.println("Element not found");  
              
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,key,low,high;
        System.out.println("Enter the number of elements");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println("Enter the element to be searched");
        key=s.nextInt();
        low=0;
        high=n-1;
        search(a,key,low,high);

    }

}
