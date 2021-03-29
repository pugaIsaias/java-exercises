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

    }
}
