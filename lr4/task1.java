package lr4;

public class task1 {
    public static void main(String[] args) {
        int height = 11;
        int i,j;
        for (i=1;i<=height;i++){
            for (j=0;j<24;j++){
                if ((j==0) || (j==23)){
                    System.out.print("|");
                }
                else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
