 
	public class person { 
	 
		  
		  String name;
		  int age;
		  person(String name, int age){
			  this.name = name;
			  this.age = age;		  
		  }
		  
		  
			@Override
			
			public String toString(){
				return "Name :"+name+"\nAge :"+ age;
				
				
			}
		
	}