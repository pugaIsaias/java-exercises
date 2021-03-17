import java.util.Calendar;

public class PorcentageOfDay{
    
    /**Cree un programa que al correrlo le diga que porcentaje del día ha pasado, considera 24hrs
    como el 100%. */

    public static void main(String[] args)
    {
        Calendar nextDay = Calendar.getInstance();
        int hour = nextDay.get(Calendar.HOUR_OF_DAY);
        int min = nextDay.get(Calendar.MINUTE);
        int sec = nextDay.get(Calendar.SECOND);

        nextDay.add(Calendar.DAY_OF_MONTH,1);
        nextDay.set(Calendar.HOUR_OF_DAY, 0);
        nextDay.set(Calendar.MINUTE, 0);
        nextDay.set(Calendar.SECOND, 0);
        nextDay.set(Calendar.MILLISECOND, 0);
        float fractionOfMinute = min/60;
        float porcentage = (hour+fractionOfMinute)*100 /24;
        System.out.println(porcentage+"%");
    }
}