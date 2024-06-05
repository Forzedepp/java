package lr5;

public class task3 {
    public int a,b;

    public task3(){
        this.a = 1;
        this.b = 2;
    }
    public task3(int a){
        this.a += a;
        b += this.a;
    }
    public task3(int d, int e){
        this.a += d;
        this.b += e;
    }

    public static void main(String[] args) {
        task3 z = new task3();
        System.out.println( z.a + " " + z.b);
        task3 c = new task3(1);
        System.out.println(c.a + " " + c.b);
        task3 e = new task3(2,3);
        System.out.println(e.a + " " + e.b);

    }
}
