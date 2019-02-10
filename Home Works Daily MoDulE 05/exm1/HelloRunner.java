

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloRunner implements Runnable {

    int i;

    @Override
    public void run() {
        i = 0;
        while (true) {
            System.out.println("Hello: " + i++);
            if (i == 10) {
                break;
            }
            try {
                Thread.sleep(1500);
                // break;
            } catch (InterruptedException ex) {
                Logger.getLogger(HelloRunner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
