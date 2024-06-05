package lr7.task3;

public class SubOfSubClass extends SubClass {
    String text;

    SubOfSubClass(int numbers, char word, String textInput){
        super(numbers,word);
        putText(textInput);
    }

    public void putText(String textInput){
        text = textInput;
    }

    @Override
    public String toString() {
        return "text=" + text + " word= " + word + " number: " + number +  " " + this.getClass().getSimpleName();
    }
}
