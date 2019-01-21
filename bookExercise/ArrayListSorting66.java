import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting66{

		public static void main(String[] args) {
			
			//ArrayList use able method
			
	ArrayList<Integer>number1 = new ArrayList<>();
	
	
	number1.add(10);
	number1.add(1);
	number1.add(0);
	number1.add(-30);
	number1.add(-40);
	number1.add(40);
	number1.add(4);
	
	System.out.println("Number1:"+number1);
	
	Collections.sort(number1);
	
	System.out.println("after sorting in ascending :"+number1);
	
	Collections.sort(number1,Collections.reverseOrder());
	
	System.out.println("after sorting in desending :" +number1);
	
	
	
	
		}


}