package lr7.task1;

public class SubClassTask extends SuperClassTask{
    private String SubText;
    private String SubWord;

    SubClassTask(String textSuperClass) {
        super(textSuperClass);
    }


    SubClassTask(String textSubClass, String SubWordClass){
        super(null);
        SubText = textSubClass;
        SubWord = SubWordClass;
    }

    @Override
    public String toString() {
        System.out.println(SubText + " " + SubWord + " " + this.getClass().getSimpleName());
        return "";
    }

    public String getSubText(){
        return SubText + SubWord;
    }

}
