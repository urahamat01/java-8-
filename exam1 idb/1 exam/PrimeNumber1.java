import java.util.*;

public class PrimeNumber1{
public static void main(String[]args){

Scanner se = new Scanner(System.in);
System.out.println("Entered your number :");


int num =se.nextInt();
for(int i=2;i<=num;i++){
	
	if(num%2==0){
		
		break;
	}
}
	if(num==2){
		System.out.println("it is prime number :");
		
	}else{
		
		System.out.println("not prime number :");
	}
	
	


}
}