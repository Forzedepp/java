package lr7.task5;

public class SuperClass {
    protected String text;

    SuperClass(String textInput){
        putText(textInput);
    }
    public void putText(String textInput){
        text = textInput;
    }
    public void printLine(){
        System.out.println(this.getClass().getSimpleName() +  " text= " + text);
    }

}

