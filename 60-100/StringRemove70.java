
public class  StringRemove70{
 
   
  public static void main(String[] args) {
  String s1 ="This is_our country Bangladesh";
  System.out.println(s1);
  
  //replace use
  String s2 = s1.replace('i','o');
  
  
   
    System.out.println(s2);
	
	
	//split use space
	String[] s3 = s1.split(" ");
	for(String x : s3){
		
		System.out.println(x);
	}
	
	//split use _
		
		String[] s4 = s1.split("_");
	for(String y : s3){
		
		System.out.println(y);
		
	}
	
  

   
  }
   
   
   
}
