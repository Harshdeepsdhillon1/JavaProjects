package HarshdeepSingh_sec002_ex03;

public class DataQueueTest {
    public static void main(String[] args) {
        // Testing queue of Strings
        DataQueue<String> stringQueue = new DataQueue<>();
        stringQueue.enqueue("Honda");
        stringQueue.enqueue("Toyota");
        stringQueue.enqueue("Dodge");

        System.out.println("Queue of Strings:");
        stringQueue.printElements();

        stringQueue.dequeue();
        System.out.println("After dequeue:");
        stringQueue.printElements();

        // Testing queue of Stock values (type double)
        DataQueue<Double> stockQueue = new DataQueue<>();
        stockQueue.enqueue(50.75);
        stockQueue.enqueue(100.25);
        stockQueue.enqueue(75.50);

        System.out.println("\nQueue of Stock values:");
        stockQueue.printElements();

        stockQueue.dequeue();
        System.out.println("After dequeue:");
        stockQueue.printElements();
    }
}

