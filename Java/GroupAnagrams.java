import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List> map = new HashMap<>();

        for(String s : strs){

            int[] count = new int[26];

            for(char c : s.toCharArray()){
                count[c-'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for(int i : count){
                sb.append("#");
                sb.append(i);
            }

            String key = sb.toString();

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s); //add the string in the ArrayList
        }

        return new ArrayList(map.values());
    }

    public static void main(String[] args) {

        String strs[] = {"act","pots","tops","cat","stop","hat"};

        System.out.println(groupAnagrams(strs));
    }
}

