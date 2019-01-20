
import java.util.LinkedList; 

	public class LinkedListDemo1{ 
	  public static void main(String[] args) {
		  
		 LinkedList<String> countryName = new LinkedList<String>();
		 //size bolay gabay na
		 //object name variable name
		 //countryName ArrayList are moto
		 
		 countryName.add("ronty");
		 countryName.add("ronty2");
		 countryName.add("ronty3");
		 countryName.add("ronty4");
		 countryName.add("ronty5");
		 countryName.add("ronty6");
		 countryName.add(6,"ronty6");
		 //countryName.addFirst("ronty6");
		// countryName.addLast("ronty6");
		 //countryName.remove("ronty6");
		 //countryName.remove(3);
		 countryName.removeFirst();
		 countryName.removeLast();
		 
		 
		 
		 
		 for(String counntry : countryName ){
		 
		  System.out.println( counntry);
		  System.out.println( countryName.getLast());
		  System.out.println(countryName.getFirst());

		  //countryName.clear();
		  //System.out.println(countryName);
		 
		  
	}
	System.out.println("size" +countryName.size());
	}
	}