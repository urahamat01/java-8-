import java.util.Scanner;

class PrimeNumber{

	public static void main(String...args){
		
		Scanner inport = new Scanner(System.in);
		int num;
		System.out.print("Enter any number :");
		
		num = inport.nextInt();
		int count =0;
		
		
		
		for(int i=2; i<num; i++){
			
			
		if(num%i==0){
			
			count++;
			break;
		}
			
			System.out.println(num);
			System.out.print (count);
		}
		if(count==0){
			
			System.out.println("prime number");
			
		}else{
		System.out.println("not prime number");
		
		}
		
		
		
		
	}

}