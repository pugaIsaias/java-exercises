public class ReverseString{
    /**Cree una función que reciba un String, y como resultado devuelva el mismo String al revés,
    ejemplo: Hola esta es un String => gnirtS un se atse aloH */

    public static void main(String[] args){
        System.out.println("El reves de 'Hola esta es un String' es : "+ reverseString("Hola esta es un String"));
    }

    public static String reverseString (String words){
        String result = "";
        for (int i= words.length()-1; i>=0; i--){
            result += words.toCharArray()[i];
        }
        return result;
    }
}