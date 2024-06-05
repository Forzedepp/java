package lr7.task2;

public class SuperClass {
    private String SuperText = "";

    SuperClass(){
        putText();
    }

    SuperClass(String text){
        putText(text);
    }

    public void putText(){
        SuperText = "Присвоение значения: ";
    }

    public void putText(String text){
        SuperText += text;
    }
    public int getLength(){
        int length = SuperText.length();
        return length;
    }
    @Override
    public String toString() {
        String StringText = SuperText +  " " + "Длина строки = " + getLength();
        return StringText;
    }
}
