public class Tester {
    public static void main(String[] args) {
        MyStack<Integer> intStack = new MyStack<Integer>();
        System.out.println("is stack empty?: "+intStack.empty());
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        System.out.println("peek at top: "+intStack.peekTop());
        System.out.println("pop the top: "+intStack.pop());
        System.out.println("peek at top: "+intStack.peekTop());
        System.out.println("is stack empty?: "+intStack.empty());
    }
}
