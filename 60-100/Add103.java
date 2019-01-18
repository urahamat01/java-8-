public class Add103{
	
	void add(int num1, int num2){
		
		
		System.out.println(num1+num2);
		
		
	}
	
	//add integer any number 
	
	void add(int num1, int num2, int num3){
		
		
		System.out.println(num1+num2+num3);
		
		
	}
	
	void add(int num1, int num2, int num3, int num4){
		
		
		System.out.println(num1+num2+num3+num4);
		
		
	}
	
	//short int add method any number
	//for each loops
	
	void add(int ... num){
		int sum =0;
		for(int x : num){
			
			sum = sum+x;
			
		}
		
		
		System.out.println(sum);
		
		
	}
	
	
	
	
}