import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class EjemploDQueue {
    public static void main(String[] args) {
        // COLA: FIFO (siempre!!!!)
        Queue<String> q = new LinkedList<String>();
        q.add("First");
        q.add("Second");
        q.add("Third");
        q.add("Fourth");

        System.out.println("Elemento borrado:");
        System.out.println(q.remove());
        
        // DEQUE: FIFO (removeFirst) o LIFO (removeLast)
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("First");
        dq.add("Second");
        dq.add("Third");
        dq.add("Fourth");
        
        System.out.println("Borra el primero: " + dq.removeFirst());
        System.out.println("Borra el segundo: " + dq.removeLast());

    }
}
