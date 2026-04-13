class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        
        // Step 1: store t frequency
        for (char c : t.toCharArray()) {
            freq[c]++;
        }
        
        int left = 0, right = 0;
        int count = t.length();
        
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        
        while (right < s.length()) {
            
            // Step 2: include right char
            if (freq[s.charAt(right)] > 0) {
                count--;
            }
            freq[s.charAt(right)]--;
            right++;
            
            // Step 3: when valid, shrink
            while (count == 0) {
                
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
                
                freq[s.charAt(left)]++;
                if (freq[s.charAt(left)] > 0) {
                    count++;
                }
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}