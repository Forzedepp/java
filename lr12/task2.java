package lr12;

import java.time.LocalTime;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++){
                System.out.println(i + " " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();

        t1.join();
    }
}
