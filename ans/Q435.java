/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int eraseOverlapIntervals(Interval[] intervals){
        if(intervals.length == 0) return 0;
        Compare c = new Compare();
        Arrays.sort(intervals, c);
        int count = 0;
        Interval curr = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i].start < curr.end){
                count++;
                continue;
            }
            curr = intervals[i];
        }
        return count;
    }
    class Compare implements Comparator<Interval>{
        public int compare(Interval i1, Interval i2){
            if (i1.end != i2.end)
                return i1.end - i2.end;            
            return i2.start - i1.start;
        }
    }
}