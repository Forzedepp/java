package lr8.task3;

import java.io.*;

public class task3 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        PrintWriter pw = null;
        String letters = "бБвВгГдДжЖзЗйЙкКлЛмМнНпПрРсСтТфФхХцЦчЧшШщЩ";

        try{
            File f2 = new File("G:\\Labs\\labs\\src\\lr8\\task3\\newfile.txt");
            f2.createNewFile();
            br = new BufferedReader(new InputStreamReader(new FileInputStream("G:\\Labs\\labs\\src\\lr8\\task3\\text.txt"), "UTF-8"));
            pw = new PrintWriter(f2.getAbsolutePath(), "UTF-8");

            String line;
            int wordsCount,lineCount = 0;
            while ((line = br.readLine()) != null){
                wordsCount= 0;
                if (line.length() != 0){
                    pw.print("Строка: " + lineCount + " ");
                    for (String word : line.split(" ")){
                        if (letters.contains(word.substring(0,1))){
                            pw.print(word + " ");
                            wordsCount++;
                        }
                    }
                }
                else {
                    pw.print("Строка "+ lineCount + " ");
                }
                pw.print("Количество слов: " + wordsCount + " \n");
                lineCount++;
            }
        }
            catch(IOException e){
                System.out.println("Ошибка: " + e);
            }
        finally {
            br.close();
            pw.flush();
            pw.close();

        }
    }
}