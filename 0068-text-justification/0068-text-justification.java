import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0, n = words.length;

        while (i < n) {
            int j = i;
            int lineLength = 0;

            // Step 1: Find how many words fit
            while (j < n && lineLength + words[j].length() + (j - i) <= maxWidth) {
                lineLength += words[j].length();
                j++;
            }

            int gaps = j - i - 1;
            StringBuilder line = new StringBuilder();

            // Step 2: Last line OR single word → left justify
            if (j == n || gaps == 0) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) line.append(" ");
                }
                // Fill remaining spaces
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                // Step 3: Fully justify
                int totalSpaces = maxWidth - lineLength;
                int spaceEach = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;

                for (int k = i; k < j; k++) {
                    line.append(words[k]);

                    if (k < j - 1) {
                        int spaces = spaceEach + (extraSpaces > 0 ? 1 : 0);
                        for (int s = 0; s < spaces; s++) {
                            line.append(" ");
                        }
                        if (extraSpaces > 0) extraSpaces--;
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}