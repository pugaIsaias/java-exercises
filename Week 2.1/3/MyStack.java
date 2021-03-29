import java.util.LinkedList;

public class MyStack<T> {
    
    private LinkedList<T> stack = new LinkedList<T>();

    public boolean empty(){
        return (stack.size()==0)?true:false;
    }

    public T peekTop(){
        return stack.peekLast();
    }

    public T pop(){
        return stack.removeLast();
    }

    public void push(T item){
        stack.add(item);
    }
}
