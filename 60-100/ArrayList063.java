
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList063{
	public static void main (String[] args) {
		
		
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		System.out.println("size ="+ number.size());
		
		//adding elements
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		number.add(5,40);
		//system.out.println(number);
		
		
		Iterator itr = number.iterator();
		while(itr.hasNext()) {
			
			System.out.print(" "+itr.next());
			
			
		}
		
		
		
		System.out.println();
		System.out.println("size ="+number.size());
	
			
	}







}