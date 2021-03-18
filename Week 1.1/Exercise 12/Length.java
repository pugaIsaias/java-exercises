public class Length{
    /**Cree una función que reciba un String y devuelva el length del String sin utilizar la propiedad
    length de la clase String. */

    public static void main(String[] args){
        System.out.println("'hello' length is "+length("hello"));
        System.out.println("'' length is "+length(""));
        System.out.println("'pacman2' length is "+length("pacman2"));
    }

    public static int length (String word){
        int count = 0;
        for (char letter:word.toCharArray()){
            count++;
        }
        return count;
    }
}