package lr4;

public class task4 {
    public static void main(String[] args) {
        int a = 4;
        char arr[][]= new char[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j <= i) {
                    arr[i][j] = '#';
                } else {
                    arr[i][j] = ' ';
                }
            }
        }
        for (int i =0; i<a; i++){
            for(int j=0;j<a;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
