import java.util.Scanner;
import java.lang.Math; 

public class PerfectNumber{
    /**Cree un programa que pida un numero al usuario y como resultado imprima si 
    el numero obtenido es un numero perfecto o no. (Número Perfecto) */
    
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in); 
        System.out.print("Ingrese un numero entero: ");  
        double inputNumber = input.nextDouble();
        
        int nextNumber = 1;
        while (perfectNumbers(nextNumber)<inputNumber){
            nextNumber++;
        }
        
        if (perfectNumbers(nextNumber)==inputNumber)
            System.out.println(inputNumber+" ES numero perfecto");
        else
            System.out.println(inputNumber+" NO ES numero perfecto");
    }

    public static double perfectNumbers(int n){
        /** useful with n from 1 forward */
        return Math.pow(2,n)*(Math.pow(2,n+1)-1);
    }
}