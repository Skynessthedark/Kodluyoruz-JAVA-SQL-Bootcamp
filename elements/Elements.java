import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Elements {
    
    public static void main(String[] args) throws Exception{
        //Elemental operations

        /**
         * LIST<T> => Tekrarlı değer var, değiştirilebilir, sıralı değil.
         */

        // List<Integer> liste = new ArrayList<>();
        // liste.add(1);
        // liste.add(3);
        // liste.add(5);
        // liste.add(3);

        // for(Integer item: liste){
        //     System.out.println(item);
        // }
        
        /**
         * SET<T> => Tekrarlı değer yok, değiştirilebilir, sıralı.
         */
        // Set<Integer> set = new HashSet<>();
        // set.add(3);
        // set.add(1);
        // set.add(5);
        // set.add(3);

        // for(Integer item: set){
        //     System.out.println(item);
        // }

        /**
         * MAP<T> => key:value ilişkili liste, tekrar var, sıralı değil, değiştirilebilir.
         */
        // Map<String, Integer> map = new HashMap<String, Integer>();
        // map.put("1. ", 3);
        // map.put("2. ", 1);
        // map.put("3. ", 5);
        // map.put("4. ", 3);
        //map values(integer)
        // for(Integer val: map.values()){
        //     System.out.println(val);
        // }

        // for (Map.Entry<String, Integer> entry: map.entrySet()){
        //     System.out.println(entry.getKey()+"" +entry.getValue());
        // }

        /**
         * Collections.sort() => listelerin sıralanmasını sağlayan metot.
         */
        // List<Integer> liste = new ArrayList<>();
        // liste.add(1);
        // liste.add(3);
        // liste.add(5);
        // liste.add(3);
        // Collections.sort(liste);

        // for(Integer item: liste){
        //     System.out.println(item);
        // }

        /**
         * TREEMAP<T,T> => Sıralı Map Sınıfı. Key'e göre sıralama yapar. Tekrar olmaz.
         */
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        map.put("1. ", 3);
        map.put("2. ", 1);
        map.put("3. ", 5);
        map.put("1. ", 6);

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+ "" + entry.getValue());
        }

    }
}
