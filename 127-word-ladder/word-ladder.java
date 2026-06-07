class Pair{
    int level;
    String word;

    Pair(int level, String word){
        this.level = level;
        this.word = word;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> set = new HashSet<>();
        for(String s : wordList) set.add(s);

        Deque<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(1, beginWord));

        set.remove(beginWord);

        while(!q.isEmpty()){

            Pair curr = q.poll();

            int step = curr.level;
            String word = curr.word;

            if(word.equals(endWord))
                return step;

            char[] arr = word.toCharArray();

            for(int i = 0; i < arr.length; i++){

                char original = arr[i];

                for(char ch = 'a'; ch <= 'z'; ch++){

                    arr[i] = ch;

                    String newWord = new String(arr);

                    if(set.contains(newWord)){

                        set.remove(newWord);
                        q.offer(new Pair(step + 1, newWord));
                    }
                }

                arr[i] = original;
            }
        }

        return 0;
    }
}