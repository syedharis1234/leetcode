class MyQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public MyQueue() {
        // Initialize two stacks
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    // Push element x to the back of queue
    public void push(int x) {
        inStack.push(x);
    }

    // Removes the element from the front of queue and returns it
    public int pop() {
        // Transfer elements from inStack to outStack if outStack is empty
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        // Pop from outStack (front of the queue)
        return outStack.pop();
    }

    // Get the front element
    public int peek() {
        // Transfer elements from inStack to outStack if outStack is empty
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        // Return the top of outStack (front of the queue)
        return outStack.peek();
    }

    // Returns whether the queue is empty
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
