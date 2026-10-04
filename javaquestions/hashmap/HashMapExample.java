package javaquestions.hashmap;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String,Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple",1);
        fruitMap.put("Orange",2);
        System.out.println("Apple Value "+ fruitMap.get("Apple"));
        fruitMap.put("Apple",44);
        System.out.println("Apple Updated Value "+ fruitMap.get("Apple"));

    }
}
