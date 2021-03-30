public class Slist<T> 
{
    private Snode<T> head;
    private int size;

    public Slist()
    {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty()
    {
        return this.head == null;
    }

    public int size()
    {
        return this.size;
    }


    public void addFirst(T data)
    {
        if(this.isEmpty())
        {
            this.head = new Snode<T>(data, null);
            this.size = 1;
            return;
        }
        this.head = new Snode<T>(data, this.head);
        this.size++;
    }

    public void addLast(T data)
    {
        if(this.isEmpty())
        {
            this.head = new Snode<T>(data, null);
            this.size = 1;
            return;
        }
        Snode<T> aux = this.head;
        while(aux.next != null)
        {
            aux = aux.next;
        }
        aux.next = new Snode<T>(data, null); 
        this.size++; 
    }

    public T removeFirst(){
        if(this.isEmpty())
        {
            return null;
        }
        Snode<T> aux = this.head;
        this.head= this.head.next();
        this.size--;
        return aux;
    }


}