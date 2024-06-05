package lr4;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        boolean x = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.println("Введите ключ: ");
        int k = in.nextInt();
        String crypto= encrypt(text,k);
        System.out.println("Текст после преобразования: " + crypto);

        do {
        System.out.println("Выполнить обратное преобразование? (y/n) ");
        String back = in.next();
            switch (back) {
                case "y":
                    String decrypto = decrypt(crypto, k);
                    System.out.println("Текст после дешифрации: " + decrypto);
                    x = true;
                    break;
                case "n":
                    System.out.println("До свидания! ");
                    x = true;
                    break;
                default:
                    System.out.println("Введите корректное значение");
                    break;
            }
        }while(x!=true);
    }
    public static String encrypt(String arr,int shift){
        char[] arrch= arr.toCharArray();
        long[] arrlo= new long[arrch.length];
        char[] arrnewch= new char[arrch.length];
        for (int i = 0; i < arrch.length; i++){
            arrlo[i]= arrch[i] + shift;
            arrnewch[i]= (char) arrlo[i];
        }
        arr= new String(arrnewch);
        return arr;

    }

    public static String decrypt(String arr,int shift){
        char[] arrayChar= arr.toCharArray();
        long[] arrayInt= new long[arrayChar.length];
        char[] arrayNewChar= new char[arrayChar.length];

        for(int i =0; i<arrayChar.length; i++){
            arrayInt[i]= arrayChar[i] - shift;
            arrayNewChar[i] = (char) arrayInt[i];
        }
        arr = new String(arrayNewChar);
        return arr;
    }


}
