import java.util.Calendar;

public class EndOfDay{
    
    /** Cree un programa que al correrlo le diga cuantos segundos 
    quedan para que se termine el día. */

    public static void main(String[] args)
    {
        Calendar rightNow = Calendar.getInstance();
        rightNow.add(Calendar.DAY_OF_MONTH,1);
        rightNow.set(Calendar.HOUR_OF_DAY, 0);
        rightNow.set(Calendar.MINUTE, 0);
        rightNow.set(Calendar.SECOND, 0);
        rightNow.set(Calendar.MILLISECOND, 0);
        System.out.println(rightNow.getTimeInMillis()-System.currentTimeMillis());
    }
}