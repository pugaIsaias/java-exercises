import java.util.Scanner;

public class BitcoinExchange{
    /**Cree un programa que pida al usuario un monto en dólares y su programa muestre el resultado
    de convertir esos dólares a bitcoins. Considere que el cambio esta a (1USD = 0.000018 Bitcoin),
    debe tener en cuenta que el usuario podrá ingresar números flotantes o números enteros. */
    
    public static void main(String[] args){
        Scanner input= new Scanner(System.in); 
        System.out.print("Ingrese la cantidad de USD a convertir: ");  
        float inputNumber = input.nextFloat();
        System.out.println(bitcoinExchange(inputNumber)+" Bitcoin");
    }

    public static double bitcoinExchange (float n){
        return n * 0.000018;
    }
}