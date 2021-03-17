import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class UserData{
/** Cree un programa que pida al usuario dos nombres, dos apellidos y una fecha de cumpleaños 
esta fecha puede ser ingresada en el formato “YYY-MM-DD” y luego de obtener la información
desplegarla en la consola, si el cumpleaños de la persona es el mismo día que se ingreso la fecha
de cumpleaños, en la consola deberá agregar el siguiente mensaje: “Feliz Cumpleaños!!” al final
de la información.*/

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        System.out.print("Ingrese primer nombre: ");  
        String firstName = sc.nextLine();
        System.out.print("Ingrese segundo nombree: ");  
        String secondName = sc.nextLine();
        System.out.print("Ingrese primer apellido: ");  
        String firstLastName = sc.nextLine();
        System.out.print("Ingrese segundo apellido: ");  
        String secondLastName = sc.nextLine();

        System.out.print("Ingrese fecha de nacimiento yyyy-mm-dd: ");  
        String birthdayInput = sc.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = new Date();
        try{
        Date date = simpleDateFormat.parse(birthdayInput);
        birthday = date;
        } catch (Exception e) {
            System.out.print(e);
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(birthday);
        int birthdayDay = cal.get(Calendar.DAY_OF_MONTH);
        int birthdayMonth = cal.get(Calendar.MONTH);  
        
        Calendar today = Calendar.getInstance();
        int todayDay = today.get(Calendar.DAY_OF_MONTH);
        int todayMonth = today.get(Calendar.MONTH); 


        System.out.println("Nombre: "+firstName+" "+secondName+" "+firstLastName+" "+ secondLastName);
        System.out.println("Fecha de nacimiento es: "+birthday);
        
        if ((todayDay==birthdayDay)&&(todayMonth==birthdayMonth)){
            System.out.println("Feliz Cumpleaños!!");
        }
    }

}