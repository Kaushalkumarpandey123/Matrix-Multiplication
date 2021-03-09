import java.io.*;
import java.util.Scanner;
public class MatrixMultiplication
{
	public static void main(String[] args)
	{
		int r1,r2,c1,c2;
		int i,j;
        System.out.println("Enter the no of row of first matrix");
		Scanner in=new Scanner(System.in);
        r1=in.nextInt();
        System.out.println("Enter the no of column of first matrix");
		Scanner ina=new Scanner(System.in);
        c1=ina.nextInt();
        System.out.println("Enter the no of row of second matrix");
		Scanner inb=new Scanner(System.in);
        r2=inb.nextInt();
        System.out.println("Enter the no of column of second matrix");
		Scanner inc=new Scanner(System.in);
        c2=inc.nextInt();
        int A[][]=new int[r1][c1];
        int B[][]=new int[r2][c2];
        int C[][]=new int[r1][c2];
        int a,b,k;
        a=r1*c1;
        b=r2*c2;
          if(c1!=r2){
              System.out.println("**Multiplication is not possible**");
          }
          else
          {
             System.out.println("Enter the "+a+" elements of first matrix\n");
             for(i=0;i<r1;i++)
             {
             	for(j=0;j<c1;j++)
             	{
                  Scanner ind=new Scanner(System.in);
                  A[i][j]=ind.nextInt();
             	}
             } 
             System.out.println("Enter the "+b+" elements of second matrix\n");
             for(i=0;i<r2;i++)
             {
             	for(j=0;j<c2;j++)
             	{
                  Scanner ine=new Scanner(System.in);
                  B[i][j]=ine.nextInt();
             	}
             }
             System.out.println("Multiplication is = ");
       for(i=0;i<r1;i++)
	    {
	  	for(j=0;j<c2;j++)
		  {
		  	C[i][j]=0;
		  for(k=0;k<c1;k++)
		     C[i][j]=C[i][j]+A[i][k]*B[k][j];
		  System.out.print(C[i][j]);
		  System.out.print("\t");
     	  }
	       System.out.print("\n");
	    }
      }
    }
}