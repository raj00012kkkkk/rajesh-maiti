package assignment;
import java.util.*;

public class LinkListAs {


		public static void main(String[] args) {
		
			LinkedList<String> al=new LinkedList<String>();  
			al.add("Rajesh");  
			al.add("Abir"); 
			al.add("Sayan");  
			al.add("Sandip");
			al.add("Ani");
			
			System.out.println("Elements in the list: "+al);
			Iterator obj = al.descendingIterator();
			 System.out.println("Elements in Reverse Order:");
		     while (obj.hasNext()) 
			 
			 {
		        System.out.println(obj.next());
		     }
			
		}

	}
