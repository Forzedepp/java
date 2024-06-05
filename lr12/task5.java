package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task5 {
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static int indexThread = 0;
    public static int maxNumber = Integer.MIN_VALUE;

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
        System.out.println(arrayList + "" + "\nmax: " + maxNumber);
    }

    public static Runnable findMaxNumber = new Runnable() {
        @Override
        public void run() {
            if (arrayList.get(indexThread) > maxNumber){
                maxNumber = arrayList.get(indexThread);
                if(indexThread < arrayList.size()){
                    indexThread++;
                }
            }else{
                if(indexThread < arrayList.size()){
                indexThread++;
            }
            }
        }

    };


}
