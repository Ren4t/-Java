package homework3;

public class PingPong {
    private boolean flag = false;


     synchronized void ping() {
         for (int i = 0; i < 10; i++) {

             while (flag != false) {
                 try {
                     this.wait();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
             System.out.print("ping - ");
             flag = true;
             this.notify();
         }
    }
    synchronized void pong() {
        for (int i = 0; i < 10; i++) {

            while (flag == false) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("pong");
            flag = false;
            notify();
        }
    }
}
