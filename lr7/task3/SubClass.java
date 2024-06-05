package lr7.task3;

public class SubClass extends SuperClass {
    char word;

    SubClass(int numbers, char wordInput){
        super(numbers);
        putWord(wordInput);
    }

    public void putWord(char wordInput){
        word = wordInput;
    }

    @Override
    public String toString() {
        return "word=" + word + " number: " + number +  " " + this.getClass().getSimpleName();
    }
}
