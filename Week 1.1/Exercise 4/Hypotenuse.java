import java.lang.Math; 

public class Hypotenuse{

    //** Cree un programa que dado 2 enteros positivos (a y b) calcule la hipotenusa (c).  */

     public static void main(String[] args){
         int a = 2;
         int b = 3;
         System.out.println(hypotenuse(a,b));
     }

     public static double hypotenuse(int a, int b){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
     }
}