import java.util.Scanner;   // Import the FileWriter class

	public class ErrorException { 
	  public static void main(String[] args) {
		  //int count = 1;
		  //do
	while(true){	  
		  try{
		  Scanner input = new Scanner(System.in);
		  System.out.println("Entered your number:");
		  int num1 = input.nextInt();
		  
		  System.out.println("Entered your number:");
		  int num2 = input.nextInt();
		  
		  int result = num1/num2;
		  
		  System.out.println("result"+num1+"/"+num2+"="+result);
		  count = 2;
		  }catch(Exception e){
			  
			  System.out.println("Exception :"+e);
			  System.out.println("You must enter integer plese try again  :"+e);
		  }
	} //while(count==1);
	}
	}