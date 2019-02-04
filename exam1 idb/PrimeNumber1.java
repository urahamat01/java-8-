import java.util.*;

public class PrimeNumber1{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
	System.out.println("Enter your number :");
	int num = input.nextInt();
	
	int i;
	
	
	for( i=2; i<num ; i++){
		
		if(num%i==0){
			break;
		}
	}
	
		if(i==num){
			
			System.out.println(num+"prime number yes");
		}else{
			System.out.println(num+"not prime number ");
			
		}
		
	

}
}