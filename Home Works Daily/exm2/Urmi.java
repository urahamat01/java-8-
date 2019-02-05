

public class Urmi implements Runnable {
    
    int i;
    
    @Override
    public void run() {
        i = 0;
        while (true) {
            System.out.println("Urmi: " + i++);
            if (i == 50) {
                break;
            }
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
}
