package lr4;

public class task7 {
    public static void main(String[] args) {
        int s = 5;
        int tmp= 0;
        int arr[][]=new int [s][s];
        for (int i = 0; i<s;i++){
            for(int j=0;j<s;j++){
                if (i % 2 ==0){
                    arr[i][j] = tmp;
                    tmp++;
                }
                else{
                    arr[i][s-j-1] = tmp;
                    tmp++;
                }
            }
        }


        for (int i = 0; i<s;i++){
            for (int j = 0; j<s;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
