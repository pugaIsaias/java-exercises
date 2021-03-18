import java.util.Scanner;

public class Multiply{
    /**Cree una función que reciba dos números enteros y devuelva la multiplicación de ellos, sin
    utilizar el operador * (operador de multiplicación) */

    public static void main (String[] args){
        Scanner input= new Scanner(System.in); 
        System.out.println("Ingrese los 2 numeros enteros a multiplicar: ");  
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1 +" * "+ num2 +" = " + multiply(num1,num2));
    }

    public static int multiply(int a, int b){
        int result = 0;
        for (int i=0; i<b; i++){
            result+=a;
        }
        return result;
    }
}