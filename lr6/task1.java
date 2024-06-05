package lr6;

public class task1 {
        char character;
        String letters = "";

        void task1(char ... array){
            if(array.length == 1){
                character = array[0];
            }
            else{
                for( int i = 0; i< array.length; i++){
                    letters += array[i];
                }
            }
        }
        void task1(String letters){
            this.letters= letters;
        }
        void task1(char character){
            this.character = character;
        }
        public char rchar(){
            return character;
        }
        public String rString(){
            return letters;
        }

        public static void main(String[] args) {
            char arrOne[]= {'A'};
            char arrTwo[]= {'A','B','C'};
            task1 a = new task1 ();
            a.task1(arrOne);
            System.out.println("Символ: "+a.rchar());
            a.task1(arrTwo);
            System.out.println("Строка: "+a.rString());
            a.task1('D');
            System.out.println("Символ без массива: " + a.rchar());
            a.task1("S");
            System.out.println("Строка без массива: "+a.rString());
        }





}
