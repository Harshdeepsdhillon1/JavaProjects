package HarshdeepSingh_sec002_ex03;

import java.util.LinkedList;

public class DataQueue<T> {
    private LinkedList<T> queue;

    public DataQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void printElements() {
        for (T element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

