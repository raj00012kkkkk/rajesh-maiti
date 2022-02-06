package assignment;
import java.util.Scanner;

public class Multidimentionalarray {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of row:");
	int m=sc.nextInt();
	System.out.println("Enter value of column");
	int n=sc.nextInt();
	int a[][]=new int[m][n];
	System.out.println("Enter element");
	for(int i=0;i<m;i++)
	  {
		for(int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
		}
	  }
		
	System.out.println("Multidimentional Array : ");

	for(int i=0;i<m;i++)
	  {
		for(int j=0;j<n;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	  }
		
		}

	}

