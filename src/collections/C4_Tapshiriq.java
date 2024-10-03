package collections;

import java.util.*;

public class C4_Tapshiriq {
    public static void main(String[] args) {
        /*
        // verilen string listdeki en uzun sozu yazdir
        // eger eyni sayda 2 soz varsa axirincini yazdir
         */

        List<String> meyveler = new ArrayList<>(Arrays.asList("armud","alma","nar","heyva"));
        String uzunSoz = "";
        for(String meyve:meyveler){
            if(meyve.length()>=uzunSoz.length()){
                uzunSoz=meyve;
            }
        }
        System.out.println(uzunSoz);

    }
}
