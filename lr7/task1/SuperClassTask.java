package lr7.task1;

public class SuperClassTask {
    private String SuperText;

    SuperClassTask(String textSuperClass){
        SuperText = textSuperClass;
    }

    public String getSuperText (){
        return  SuperText;
    }

    @Override
    public String toString() {
        System.out.println(SuperText + " " + this.getClass().getSimpleName());
        return "";
    }
}
