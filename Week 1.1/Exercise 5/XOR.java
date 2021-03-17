public class XOR{
    /** Usted debe crear un programa con una función que emule ser una compuerta lógica de tipo
    XOR, considere el valor 0 como “FALSO” y el valor 1 como “VERDADERO”. A continuación, la
    tabla para la compuerta lógica:
    La salida del programa debe de ser la tabla de la compuerta, imprimiendo los parámetros
    enviados a su función y el resultado de la función.  */
    
    public static void main (String[] args){

        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.println(i+" XOR "+j+" = "+ xor(isTrue(i),isTrue(j)));
            }
        }
    }

    public static boolean isTrue(int a){
        return a != 0;
    }

    public static boolean xor (boolean a, boolean b){
        return (!a && b) || (a && !b);
    }
}