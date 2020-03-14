public class Main {
    public static void main(String[] args) {
        PriorityQueueImplementation obj = new PriorityQueueImplementation(5);
        obj.insert(20,3);
        obj.insert(30,1);
        obj.insert(45,6);
        obj.dequeue();
        obj.insert(25,2);
        obj.display();
    }
}
