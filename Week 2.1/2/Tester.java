import java.util.Date;
import java.util.GregorianCalendar;

public class Tester {
    public static void main(String[] args) {
        //Test for Task
        System.out.println("/////Start Task tests/////");
        
        //Instance with msg
        System.out.println("Testing instance Task with msg");
        Task item1 = new Task("Hello first instance with just msg");
        System.out.println("item1: "+item1.toString());
        System.out.println("-----------");
        
        //Instance with msg
        System.out.println("Testing instance Task with msg, priority and date");
        Date fecha2 = new GregorianCalendar(2021,07,11).getTime();
        Task item2 = new Task("Hello second instance method with msg, priority and date",2, fecha2);
        System.out.println("item2: "+item2.toString());
        System.out.println("-----------");
        
        //Instance with msg
        System.out.println("Testing instance Task with msg, priority, date and note");
        Date fecha3 = new GregorianCalendar(2021,06,11).getTime();
        Task item3 = new Task("Hello third instance method with msg, priority, date and note",4, fecha3,"Today is Isaias birthday");
        System.out.println("item3: "+item3.toString());
        System.out.println("note of item3: "+ item3.getNotes());
        System.out.println("-----------");

        //Using Task Date
        System.out.println("Testing getTaskDate");
        System.out.println(item1.getTaskDate());
        System.out.println(item3.getTaskDate());
        System.out.println("-----------");
        
        System.out.println("/////Finish Task tests/////");
        
        System.out.println("/////Start TaskList tests/////");

        //Init with name
        System.out.println("Test instance with name");
        TaskList tasksList1 = new TaskList("First list");
        tasksList1.printList();
        
        //Init with name and task
        System.out.println("Test instance with name and task");
        TaskList tasksList2 = new TaskList("Second list", item1);
        tasksList2.printList();

        System.out.println("-----------");
        System.out.println("Test of adding items to a List");
        tasksList1.addTask(item1);
        tasksList1.addTask(item2);
        tasksList1.addTask(item3);
        tasksList1.printList();
        System.out.println("/////Finish TaskList tests/////");
    }
}
