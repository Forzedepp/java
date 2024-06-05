package lr3;

public class task8 {
    public static void main(String[] args) {
        int k = 10;
        char[] letters = new char[k];
        char l = 'A';

        for (int i = 0; i < letters.length; i++){
            switch(l){
                case 'A':
                    l++;
                    break;
                case 'E':
                    l++;
                    break;
                case 'I':
                    l++;
                    break;
            }
            letters[i] = l;
            l+=1;
            System.out.print(letters[i] + " ");
        }
        System.out.print("\n");
        for (int j= letters.length - 1; j>=0; j--){
            System.out.print(letters[j] + " ");
        }
    }
}
