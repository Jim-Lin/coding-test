import java.util.Arrays;
import java.util.PriorityQueue;

// Definition for an interval.
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class MeetingRoomsII {

    public static void main(String args[]) {
        Interval[] intervals = new Interval[]{new Interval(0, 30), new Interval(5, 10), new Interval(15, 20)};
        System.out.println("time intervals are [[0, 30],[5, 10],[15, 20]], the minimum number of conference rooms is " + minMeetingRooms(intervals));
    }

    private static int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> a.start - b.start);

        PriorityQueue<Integer> end = new PriorityQueue<>();
        end.offer(intervals[0].end);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= end.peek()) {
                end.poll();
            }

            end.offer(intervals[i].end);
        }

        return end.size();
    }
}
