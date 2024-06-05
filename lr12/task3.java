package lr12;

public class task3 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for(int i = 1; i<=10;i++){
                if (i % 2 ==0){
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread( () -> {
            for(int i = 1; i<=10;i++){
                if (i % 2 !=0){
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
