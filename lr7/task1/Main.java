package lr7.task1;

public class Main {

    public static void main(String[] args) {
        SuperClassTask SuperMain = new SuperClassTask(" SuperClass ");
        String SuperClassText = SuperMain.toString();

        SubClassTask SubMain = new SubClassTask("Sub", "Class");
        String SubClassText = SubMain.toString();
    }

}
