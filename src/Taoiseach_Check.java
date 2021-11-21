import jdk.swing.interop.SwingInterOpUtils;

public class Taoiseach_Check{
    public static void main(String[] args) {
        Taoiseach t1 = new Taoiseach();
        Taoiseach t2 = new Taoiseach();

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());


    }
}
