import java.text.DecimalFormat;   // Import the DecimalFormat 

	public class Decimal { 
	  public static void main(String[] args) {
		  
		  
		 DecimalFormat ob = new DecimalFormat("0.0000");
	double x = 2.9875488;
		  System.out.println("result x = "+ob.format(x));
		 
		  
	}
	}