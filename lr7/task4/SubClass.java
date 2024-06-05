package lr7.task4;

public class SubClass extends SuperClass {
    String text;

    SubClass(char character, String textInput){
        super(character);
        putText(textInput);
    }

    public void putText(String textInput){
        text = textInput;
    }

    @Override
    public String toString() {
        return super.toString() +" text= " + text;
    }

    public SubClass copy(){
        return new SubClass('A',"text");
    }
}
