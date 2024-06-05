package lr7.task2;

public class SubClass extends SuperClass {
    private String SubText;
    int numbers;
    SubClass(){
        putSubText();
    }
    SubClass(int number){
        putSubText();
        putNumbers(number);
    }
    SubClass(String text,int number){
        putSubText(text);
        putNumbers(number);
        //getAll(text, number);
    }
    public void putSubText(){
        SubText = "Пустой текст";
    }
    public void putSubText(String text){
         SubText = text;
    }
    public void putNumbers(int number){
        numbers= number;
    }

    private int getLenght(){
        int length = SubText.length();
        return length;
    }
/*    public String getAll(String text,int number){
        int length = getLenght();
        return "Число равно: " + number + " Длинна строки: " + length;
    }*/
    @Override
    public String toString() {
        if (numbers != 0) {
            String StringText = SubText + " " + "Длина строки = " + getLenght()+ " Число равно:" + numbers;
            return StringText;
        }
        String StringText = "Число равно: " + numbers;
        return StringText;
    }
}
