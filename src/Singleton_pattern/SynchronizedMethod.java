package Singleton_pattern;

public class SynchronizedMethod {
    private static  SynchronizedMethod Taoiseach = null ;
    private int number = 0;
    private SynchronizedMethod() {}
    public static synchronized SynchronizedMethod getTaoiseach()
    {
        if (Taoiseach == null)
            Taoiseach = new SynchronizedMethod();
        return Taoiseach;
    }
    public void setnumber(int n){
        this.number = n;
    }
    public int getNumber(){
        return number;
    }

}
