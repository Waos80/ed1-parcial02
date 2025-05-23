package ed.lab;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class E01MeetingRooms {

    public int minMeetingRooms(List<MeetingInterval> meetingIntervals) {
        if (meetingIntervals.isEmpty()) {
            return 0;
        }

        Queue<MeetingInterval> startTimeMinHeap = new PriorityQueue<>((a, b) -> a.startTime() - b.startTime());
        Queue<MeetingInterval> endTimeMinHeap = new PriorityQueue<>((a, b) -> a.endTime() - b.endTime());

        for (MeetingInterval interval : meetingIntervals) {
            startTimeMinHeap.offer(interval);
        }

        int rooms = 0;
        int time = 0;
        while (!startTimeMinHeap.isEmpty()) {
            MeetingInterval interval = startTimeMinHeap.peek();

            if (interval.startTime() < time) {
                endTimeMinHeap.offer(startTimeMinHeap.poll());
                rooms = Math.max(endTimeMinHeap.size(), rooms);
            }

            if (!endTimeMinHeap.isEmpty() && endTimeMinHeap.peek().endTime() <= time) {
                endTimeMinHeap.poll();
            }

            if (endTimeMinHeap.isEmpty() || (interval.startTime() != endTimeMinHeap.peek().startTime())) {
                time++;
            }
        }

        return rooms;
    }

}
