
public class App {

    public static void main(String[] args) {
		
		//first class
		
        Uncle uncle = new Uncle();
        Thread uncleThread = new Thread(uncle);
        uncleThread.setName("Mr. Jamil");
        uncleThread.setPriority(1);
        uncleThread.start();

		
		//secand class 
        Urmi u = new Urmi();
        Thread urmiThread = new Thread(u);
        urmiThread.setName("Urmi");
        urmiThread.setPriority(10);
        urmiThread.start();
		
		//println method

        System.out.println("uncleThread Name " + uncleThread.getName());
        System.out.println("urmiThread name " + urmiThread.getName());
        System.out.println("uncleThread Priority " + uncleThread.getPriority());
        System.out.println("urmiThread Priority " + urmiThread.getPriority());
    }

}
