package lr7.task3;

public class SuperClass {
    public int number;

    SuperClass (int numberInput){
        putNumber(numberInput);
    }
    public void putNumber(int numberInput){
        number = numberInput;
    }

    @Override
    public String toString() {
        return "number=" + number + " " + this.getClass().getSimpleName();
    }
}
