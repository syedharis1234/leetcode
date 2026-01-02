import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        // Add the new request's timestamp to the queue
        queue.offer(t);
        
        // Remove any requests that are outside the 3000 ms window
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        
        // Return the number of requests within the window
        return queue.size();
    }
}
