package assignment;
import java.util.Arrays;
import java.util.*;

public class AssendingOrderArray {

		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("How many number want to put:");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter "+n+" number");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
				
			Arrays.sort(a);
			System.out.println("Array after sorting ascending order is");
			for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");
		}

	}

