
import java.util.logging.Level;
import java.util.logging.Logger;

public class SecondWay extends Thread{


int i =0;

	public void run(){

		try{
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
		
		
		Logger.getLogger(SecondWay.class.getName()).log(Level.SEVERE, null, ex);
		
		}
		
		System.out.println("thread started running....");
		while (true){
		
		System.out.println("Result of i :"+ i++);
		if(i==0) {
		break;
		}




	}


	}

	public static void main(String[] args) {

	Thread t = new SecondWay();

	t.start();
	Thread tt = new Thread();

	tt.start();
	System.out.println("tt :"+ tt.getName());
	}
}