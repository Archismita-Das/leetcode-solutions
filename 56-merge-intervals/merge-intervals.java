import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(a-> a[0]));

    int currentStart = intervals[0][0];
    int currentEnd = intervals[0][1];

    ArrayList<int[]>MergedInterval = new ArrayList<>();

    for(int i=0; i<intervals.length;i++){
        int NextStart = intervals[i][0];
        int NextEnd =intervals[i][1];

        if(currentEnd < NextStart){
            MergedInterval.add(new int[] {currentStart, currentEnd});
            currentStart = NextStart;
             currentEnd = NextEnd;
        }
        else{
            currentEnd = Math.max(currentEnd, NextEnd);
        }
    }
     MergedInterval.add(new int[] {currentStart, currentEnd});
     return MergedInterval.toArray(new int[MergedInterval.size()][]);
    }
}