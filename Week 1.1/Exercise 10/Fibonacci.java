import java.util.Scanner;

public class Fibonacci{
    /**Cree un programa con una función llamada “Fibonacci” que reciba un numero como parámetro
    y devuelva el resultado de la secuencia correspondiente para dicho número. */
    
    public static void main(String[] args){
        Scanner input= new Scanner(System.in); 
        System.out.print("Ingrese hasta que numero de Fibonacci que desea: ");  
        int inputNumber = input.nextInt();
        System.out.println("Fibbonacci("+inputNumber+") = "+fibonacci(inputNumber));
    }

    public static int fibonacci(int n){
        if (n == 0)
            return 0;
        else
        if (n == 1)
            return 1;
        else 
            return fibonacci(n-1)+fibonacci(n-2);
    }


}