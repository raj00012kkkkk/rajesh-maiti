package assignment;
import java.util.*;

class Multiplications {

		void display() {
			
			System.out.println("Enter value of x,y,z :");
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			int p=x*y*z;
			System.out.println("Product of three no is :"+p+"Rajesh");
		}
	}
	public class Multiplication {

		public static void main(String[] args) {

	Multiplications t=new Multiplications();
	 t.display();
		}

	}
