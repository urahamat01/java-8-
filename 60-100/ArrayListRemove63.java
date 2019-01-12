

import java.util.ArrayList;


public class ArrayListRemove63{
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
		
		
		
		System.out.println("before ArrayList contains :"+number);
		
		
		
		
		System.out.println();
		System.out.println("size ="+number.size());
		
		
		number.remove(2);
		System.out.println("after removing ArrayList contains :"+number);
		
		number.removeAll(number);
		System.out.println("after removing all ArrayList contains :"+number);
	
			
	}







}