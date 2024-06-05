package lr3;

public class task7 {
    public static void main(String[] args) {
        int j = 10;
        char[] letters = new char[j];
        char l = 'а';

        for (int i = 0; i < letters.length; i++){
            letters[i] = l;
            l+=2;
            System.out.print(letters[i] + "\t");
        }

        System.out.println();
        for (int i = letters.length - 1 ; i >= 0; i--){
            System.out.print(letters[i] + "\t");
        }
    }
}
