package hw9;

import java.util.HashMap;
import java.util.Map;

public class Programme_9 {
    public static void main(String[] args) {
        Map<Integer,String> list=new HashMap();
        list.put(10,"nehal");
        list.put(20,"karan");
        list.put(30,"friends");

        for(  Map.Entry<Integer,String>Friends :list.entrySet()   ){
            System.out.println("Friends");
        }


    }
}
