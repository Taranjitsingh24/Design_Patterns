public class SynchronizedMethod {
    private static  SynchronizedMethod Taoiseach = null ;
    private int number = 0;
    private SynchronizedMethod() {}
    public static SynchronizedMethod getTaoiseach()
    {
        if (Taoiseach == null)
            Taoiseach = new SynchronizedMethod();
        return Taoiseach;
    }

}
