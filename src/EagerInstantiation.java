public class EagerInstantiation {
    private static final EagerInstantiation Taoiseach = new EagerInstantiation() ;
    private int number = 0;

    private EagerInstantiation(){}

    public static EagerInstantiation getTaoiseach()
    {

        return Taoiseach;
    }
    public void setnumber(int n){
        this.number = n;
    }
    public int getNumber(){
        return number;
    }


}
