package Singleton_pattern;

import jdk.swing.interop.SwingInterOpUtils;

public class Taoiseach_Check{
    public static void main(String[] args) {
        Taoiseach t1 = new Taoiseach();
        Taoiseach t2 = new Taoiseach();

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        if (t1==t2){
            t1.setNumber_of_Taoiseach(1);
            System.out.println("There can be only " + t1.getNumber_of_Taoiseach() + " Taoiseach in ireland");
        }
        else{
            t2.setNumber_of_Taoiseach(2);
            System.out.println("There are " + t2.getNumber_of_Taoiseach() + " Taoiseach in Ireland");
        }


    }
}
