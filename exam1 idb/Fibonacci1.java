public class Fibonacci1 {
    public static void main(String[] args) {
       
         int a=1,b=1,c=0;
          System.out.println(a);
          System.out.println(b);
		int ctr=0;
		
		while(ctr<5){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			ctr++;
		}
    }
}