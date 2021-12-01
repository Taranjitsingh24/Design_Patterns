package Singleton_pattern;

public class LazyInstantiation {
    private static  LazyInstantiation Taoiseach = null ;
    private int number = 0;
    private LazyInstantiation() {}
    public static LazyInstantiation getTaoiseach()
    {
        if (Taoiseach == null)
            Taoiseach = new LazyInstantiation();
        return Taoiseach;
    }
    public void setnumber(int n){
        this.number = n;
    }
    public int getNumber(){
        return number;
    }







}
