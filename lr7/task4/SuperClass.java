package lr7.task4;

public class SuperClass {
    char character;

    SuperClass(char charInput){
        putChar(charInput);
    }

    public void putChar(char characterInput){
        character = characterInput;
    }

    @Override
    public String toString() {
        return "character:" +  character;
    }


}

