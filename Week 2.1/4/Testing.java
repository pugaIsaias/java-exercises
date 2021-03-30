public class Testing {
   public static void main(String[] args) {
       Slist<Integer> list = new Slist<Integer>();
       list.addFirst(1);
       list.addFirst(0);
       list.addLast(2);
       System.out.println("--remove first test--");
       System.out.println(list.toString());
       list.removeFirst();
       System.out.println(list.toString());
       list.addFirst(0);
       System.out.println("--remove last test--");
       System.out.println(list.toString());
       list.removeLast();
       System.out.println(list.toString());
       list.addLast(2);
       System.out.println("--remove Index:1 test--");
       System.out.println(list.toString());
       list.remove(1);
       System.out.println(list.toString());

   } 
}
