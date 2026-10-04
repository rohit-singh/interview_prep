package javaquestions.hashmap;
import java.util.*;
//Country Population HashMap
public class HashMapDemo {

    public static void main(String[] args) {

        Map<String,Integer> country = new HashMap<>();

        //Insertion
        country.put("India",100);
        country.put("China",130);
        country.put("US",30);
        System.out.println(country);
        country.put("China",180);
        System.out.println("After updating China Population\n" + country);

        //Fetch Operation - using get() method
        System.out.println("Population of India " + country.get("India"));
        System.out.println("Population of Thailand " + country.get("Thailand")); //return null

        if(country.containsKey("China")) {
            System.out.println("Key exist in Map");
        }else {
            System.out.println("Key DOESN't exist in Map");
        }

        //Iteration  - Important
        for(Map.Entry<String,Integer> e : country.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }

        //Using KeySet
        Set<String> keys = country.keySet();
        for(String key : keys){
            System.out.println("Key = "+ key + " Value = "+ country.get(key));
        }

        //Remove
        country.remove("China");
        System.out.println("Map after removing China " + country);

    }
}



