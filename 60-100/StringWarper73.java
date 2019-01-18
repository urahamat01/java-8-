import java.util.ArrayList;
import java.util.Collections;

public class StringWarper73{

		public static void main(String[] args) {
			
			//ArrayList buffered use able method
	StringBuilder str = new StringBuilder("rahamat ullah");
	
	System.out.println("after buffered in desending :" +str);
	
	str.append("rony");
	str.append(45);
	str.append(12.8);
	System.out.println("str = " +str);
	
	str.reverse();
	System.out.println(str);
	str.delete(2,7);
	System.out.println(str);
	
	
	
	
		}


}