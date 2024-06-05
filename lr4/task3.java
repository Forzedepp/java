package lr4;

public class task3 {
    public static void main(String[] args) {
        int arr[][]= new int[2][3];
        for (int i =0; i<2; i++){
            for(int j=0;j<3;j++){
                arr[i][j]=2;
            }
        }
        for (int i =0; i<2; i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j] +" "+arr[i][j+1]);
                System.out.println(" ");
            }
        }

    }
}
