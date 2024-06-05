package lr7.task5;

public class SubClass extends SuperClass {
    protected int number;
    SubClass(String text, int numberInput) {
        super(text);
        putNumber(numberInput);

    }
    public void putNumber(int numberInput){
        number = numberInput;
    }
    public void subPrintLine(){
        System.out.println(this.getClass().getSimpleName() +  " text= " + text + " number= " + number);
    }
}
