class Problem622DesignCircularQueue {

    int count = 0;
    int[] queue = null;
    int front = 0;
    int rear = -1;
    int len = 0;

    public MyCircularQueue(int k) {
        queue = new int[k];
        len = k;
    }
    
    public boolean enQueue(int value) {
        if (isFull())
            return false;

        rear++;
        rear = rear%len;
        queue[rear] = value;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty())
            return false;

        front++;
        front = front%len;
        count--;
        return true;
    }
    
    public int Front() {
        if (count == 0)
            return -1;
        else
            return queue[front];
    }
    
    public int Rear() {
        if (count == 0)
            return -1;
        else
            return queue[rear];
    }
    
    public boolean isEmpty() {
        if (count == 0)
            return true;
        else
            return false;
    }
    
    public boolean isFull() {
        if (count >= len)
            return true;
        else
            return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
