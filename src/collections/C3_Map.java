package collections;

import java.util.*;

public class C3_Map {
    public static void main(String[] args) {
        Map<String,String> insan  = new HashMap<>();
        insan.put("ad","Orxan");
        insan.put("soyad","Allahverdiyev");
        insan.put("yash",null);
//        System.out.println(insan);
//        System.out.println(insan.get("yash"));
//        System.out.println(insan.get("gozununRengi"));

        //key iteration
//        for(String key: insan.keySet()){
//            System.out.println(key);
//        }

        //value iteration
//        for(String value: insan.values()){
//            System.out.println(value);
//        }

        //entrySet iteration -> key+value
//        for(Map.Entry<String,String> entry: insan.entrySet()){
//            System.out.println(entry.getKey() + "->" +entry.getValue());
//        }

//        insan.putIfAbsent("middleAd","Elxan");
//        System.out.println(insan);

//        System.out.println(insan.getOrDefault("middleAd","Bele bir acar yoxdur"));
            //Lambda expression
            insan.forEach((key,value)-> System.out.println(value));
    }
}
