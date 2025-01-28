import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        // Add the new request to the queue
        queue.add(t);
        
        // Remove all requests that are outside the 3000ms range
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        
        // Return the number of requests in the queue
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
