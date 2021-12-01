package Singleton_pattern;

public class Enum_Singleton_Test {
    public static void main(String[] args) {


        Enum_Singleton taoiseach = Enum_Singleton.TAOISEACH;
        Enum_Singleton taoiseach2 = Enum_Singleton.TAOISEACH;
        System.out.println(taoiseach.hashCode());
        System.out.println(taoiseach2.hashCode());

        if (taoiseach== taoiseach2){
            taoiseach.setnumber(1);
            System.out.println("There can be only " + taoiseach.getNumber() + " Taoiseach in ireland");
        }
        else{
            taoiseach2.setnumber(2);
            System.out.println("There are " + taoiseach2.getNumber() + " Taoiseach in Ireland");
        }

    }

}
