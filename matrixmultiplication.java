import java.util.Scanner;
public class matrixmultiplication
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int row1,col1,row2,col2,i,j,k;
        System.out.println("Enter number of rows of first matrix");
        row1=s.nextInt();
        System.out.println("Enter number of columns of first matrix");
        col1=s.nextInt();
        System.out.println("Enter number of rows of second matrix");
        row2=s.nextInt();
        System.out.println("Enter number of columns of second matrix");
        col2=s.nextInt();
        if(col1!=row2)
          System.out.println("Matrix Multiplication not possible");
        int a[][]=new int[row1][col1];
        int b[][]=new int[row2][col2];
        int c[][]=new int[row1][col2];
        System.out.println("Enter elements of first matrix");
        for(i=0;i<row1;i++)
            for(j=0;j<col1;j++)
                a[i][j]=s.nextInt();
        System.out.println("Enter elements of second matrix");
        for(i=0;i<row2;i++)
            for(j=0;j<col2;j++)
                    b[i][j]=s.nextInt();
        for(i=0;i<row1;i++)
            {for(j=0;j<col2;j++)
               { c[i][j]=0;
                 for(k=0;k<col1;k++)
                     c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                 System.out.print(c[i][j]+" ");
               }
            System.out.println();
            }

    
    }
}