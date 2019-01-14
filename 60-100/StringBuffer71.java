
public class  StringBuffer71{
 
   
  public static void main(String[] args) {
	  
	  //String s1 ="Rahamat ullah"
										//s1
	  StringBuffer sb = new StringBuffer("Rahamat ullah");
	  
	  System.out.println(sb);
	  
	  //sb.replace("MD. ");
	  System.out.println(sb);
	  
	  sb.append(" Rony ");
	  sb.append(" 27");
	  System.out.println(sb);
	  
	  sb.delete(0,5);
	  System.out.println(sb);
	  
	  sb.setLength(5);
	  System.out.println(sb);
 

   
  }
   
   
   
}
