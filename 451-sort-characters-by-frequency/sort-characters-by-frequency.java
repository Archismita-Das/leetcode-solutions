import java.util.*;
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        List<Character>[] bucket = new List[s.length() + 1];
        for (char c : map.keySet()) {
            int f = map.get(c);
            if (bucket[f] == null) bucket[f] = new ArrayList<>();
            bucket[f].add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = bucket.length - 1; i > 0; i--) {
            if (bucket[i] != null) {
                for (char c : bucket[i]) {
                    sb.append(String.valueOf(c).repeat(i));
                }
            }
        }
        return sb.toString();
    }
}