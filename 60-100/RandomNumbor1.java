
import java.util.Random;

public class RandomNumbor1{

	public static void main(String[] args) {
	
	Random rand = new Random();
	
	//one method
	//int randomNumber = rand.nextInt(10)+0;// 0 to 9
	
	//another mathod
	
	int randomNumber = (int) (Math.random()*10) +1;// 0 to 9
	//int randomNumber = rand.nextInt(10);// 0 to 10
	//int randomNumber = rand.nextInt(91) + 10;// 10 to 100
	//int randomNumber = rand.nextInt(5) + 1;// 1 to 5

	System.out.println(randomNumber);
	
	
	}


}