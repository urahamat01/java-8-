public class ThisKeyWord122{
	String name;
  int age;
  String hairColor;
	

	  ThisKeyWord122(String name, int age){
	
	this.name = name;
	this.age = age;		
		
		
	}
	
	 ThisKeyWord122(String name, int age, String hairColor){
		
		
		
		//this(name, age);
		//this keyword babare karta hobay  call dayo gabay		
	
	this.name = name;
	this.age = age;
	this.hairColor = hairColor;
	
		
	}
	void display(){
		
		
		System.out.println("Name :" +name);
		System.out.println("Name :" +age);
		System.out.println("Name :" +hairColor);
		
	}
	
	
	
	//short cut are madama this keyword madama call dayo gai
	
	
	void display2(){
		
		
		this.display();
		System.out.println("Name :" +hairColor);
		
		
		
	}
	
	
	
	
	

		
	}
	
	
	
	
