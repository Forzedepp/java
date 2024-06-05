package lr12;

public class task4 {
    public static void main(String[] args) throws InterruptedException{
        Thread[] threads = new Thread[10];
        for (int i = 0; i< threads.length; i++){
            threads[i] = new Thread(getNameFromThread);
            threads[i].start();
            threads[i].join();
        }
    }

    public static Runnable getNameFromThread = new Runnable() {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    };
}
