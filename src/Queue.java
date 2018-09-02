import java.util.ArrayList;
import java.util.List;

public class Queue<T>
{
    private List<T> queue;

    public Queue()
    {
        queue = new ArrayList<T>();
    }

    public void enqueue(T obj)
    {
        queue.add(obj);
    }

    public T dequeue()
    {
        if (!queue.isEmpty())
            return queue.remove(0);
        else
            return null;
    }

    public int length()
    {
        return queue.size();
    }
}
