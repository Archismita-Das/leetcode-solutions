class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String smallest = strs[0];


        for (String s : strs) {
            if (s.length() < smallest.length()) {
                smallest = s;
            }
        }
        
        for (int i = 0; i < smallest.length(); i++) {
            char ch = smallest.charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != ch) {
                    return smallest.substring(0, i);
                }
            }
        }
        return smallest;
    }
}
