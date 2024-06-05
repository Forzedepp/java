package lr6;

public class task7 {

    public static int[] CharToInt(char[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length;i++){
            newArray[i] = (int) array[i];
        }
        return  newArray;
    }

    public static void main(String[] args) {
        char[] array = {'C','B','D','E'};
        int[] newArray = CharToInt(array);
        for (int i = 0; i< newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }
}
