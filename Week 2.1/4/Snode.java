public class Snode<T>
{
    T data;
    Snode<T> next;

    public Snode(T data, Snode<T> next)
    {
        this.data = data;
        this.next = next;
    }
}