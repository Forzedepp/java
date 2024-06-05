package lr12;

import java.util.ArrayList;
import java.util.Random;

public class task6 {
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static int indexThread = 0;
    public static int sum = 0;

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();


        for(int i = 0; i < Runtime.getRuntime().availableProcessors();i++){
            arrayList.add(random.nextInt(100));
        }

        Thread[] threads = new Thread[Runtime.getRuntime().availableProcessors()];
        for(int i = 0; i < threads.length; i++){
            threads[i]= new Thread(findMaxNumber);
            threads[i].start();
            threads[i].join();
        }

        System.out.println(arrayList + "" + "\nsumma: " + sum);
    }

    public static Runnable findMaxNumber = new Runnable() {
        @Override
        public void run() {
                sum += arrayList.get(indexThread);
                if(indexThread < arrayList.size()){
                    indexThread++;
                }else {}
        }

    };
}
