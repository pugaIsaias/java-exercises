import java.util.Scanner;

public class SumUntilNumber{
    /**Dado un número, calcule la suma de todos los números anteriores hasta él y 
    despliegue el resultado. Ejemplo 10, 1 + 2+ 3+ 4+5+6+7+8+9+10 = 55 */
    
    public static void main(String[] args){
        Scanner input= new Scanner(System.in); 
        System.out.print("Ingrese un numero entero: ");  
        int inputNumber = input.nextInt();
        System.out.println(sumUntilNumber(inputNumber));
    }

    public static int sumUntilNumber (int n){
        int result = 0;
        for (int sumThis = 1; sumThis<=n; sumThis++){
            result+= sumThis;
        }
        return result;
    }
}