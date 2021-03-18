public class Palindromo{
    /**Cree una función que reciba como parámetro un String y determine si el String es palíndromo o no. */
    
    public static void main (String[] args){
        System.out.println("La palabra 'abcdcda' "+esPalindromo(isPalindromo("abcdcda")));
        System.out.println("La palabra 'abcdcba' "+esPalindromo(isPalindromo("abcdcba")));
        System.out.println("La palabra 'abccba' "+esPalindromo(isPalindromo("abccba")));
        System.out.println("La palabra 'abacba' "+esPalindromo(isPalindromo("abacba")));
    }

    public static boolean isPalindromo(String word){
        int middlePoint = word.length()/2;
        boolean result = true;
        for(int i=0; i<middlePoint; i++){
            if (word.toCharArray()[i]!=word.toCharArray()[word.length()-1-i])
                result = false;
        }
        return result;
    }

    public static String esPalindromo(boolean bool){
        return bool?"ES palindromo":"NO ES palindromo";
    }
}