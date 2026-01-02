import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push element x onto stack
    public void push(int x) {
        // Push x to queue2
        queue2.offer(x);
        
        // Push all elements of queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        
        // Swap the names of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Removes the element on top of the stack and returns that element
    public int pop() {
        return queue1.poll();  // The front of queue1 will be the top of the stack
    }

    // Get the top element
    public int top() {
        return queue1.peek();  // The front of queue1 will be the top of the stack
    }

    // Returns whether the stack is empty
    public boolean empty() {
        return queue1.isEmpty();  // Stack is empty if queue1 is empty
    }
}
