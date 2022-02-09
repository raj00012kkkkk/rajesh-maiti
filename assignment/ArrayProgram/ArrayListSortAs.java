package assignment;
import java.util.*;

public class ArrayListSortAs {


		public static void main(String[] args) {
			List<String> list = new ArrayList<String>();
			  list.add("Pink");
			  list.add("Yellow");
			  list.add("Red");
			  list.add("Blue");
			  list.add("Orange");
			  list.add("White");
			  list.add("Black");
			  
			  System.out.println("List before sort: "+list);
			  Collections.sort(list);
			  System.out.println("List after sort: "+list);  
		}

	}
