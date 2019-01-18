public class Studenta{



		void totalStudent(){
			
			totalStudent1();//static call karta parbo
			int x; //static diclar karta parbo na;
			static int x; //static value data holay static hotay hobay
			
			//non static kono cymo badata nay;
			
			//non static static moday call datay parbay na
			
			//static non static moday call datay parbay
			
			
		
		System.out.println("total students non static ");
		}
		
		static void totalStudent1(){
			int x; //non static value diclar karta parbo na
			static int x; //static call karta parbo
			
			 totalStudent(); //parbo na non static call kartay
			
			//static kycu symo badayta aca 
			
			//non static method static method moday call data parbo na
			
			//call data holay static hotay hobay
			
			//non static value call datay parboy na static value hotay hobay
			//static static parbay kynto non static parbay na
			
			//static non static call datay parbay 
		
		System.out.println("total students static ");
		}


}