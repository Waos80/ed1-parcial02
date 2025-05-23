package ed.lab;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class E01MeetingRooms {

    public int minMeetingRooms(List<MeetingInterval> meetingIntervals) {
        if (meetingIntervals.isEmpty()) {
            return 0;
        }


        /*
        Queue<MeetingInterval> endTimeMinHeap = new PriorityQueue<>((a, b) -> a.endTime() - b.endTime());
        Queue<MeetingInterval> endTimeMaxHeap = new PriorityQueue<>((a, b) -> b.endTime() - a.endTime());
        Queue<MeetingInterval> startTimeMinHeap = new PriorityQueue<>((a, b) -> a.startTime() - b.startTime());
        Queue<MeetingInterval> startTimeMaxHeap = new PriorityQueue<>((a, b) -> b.startTime() - a.startTime());

        for (MeetingInterval interval : meetingIntervals) {
            startTimeMinHeap.offer(interval);
            endTimeMaxHeap.offer(interval);
        }

        int rooms = 0;
        int time = 0;
        while (!startTimeMinHeap.isEmpty()) {
            MeetingInterval interval = startTimeMinHeap.poll();
            if (interval.startTime() <= time && time <= interval.endTime()) {
                endTimeMinHeap.offer(interval);

            }
            time++;
        }

        return rooms;

         */
    }

}
