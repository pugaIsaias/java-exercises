import java.lang.Math;
import java.util.Scanner;

public class ASCCI{
    /**
    Cree un programa que pida al usuario el primero y segundo nombre, así como el primer y segundo apellido, 
    y luego despliegue las iniciales en ascci art, cada letra debe estar compuesta por el carácter #. Por ejemplo, 
    Carmen Elisabeth Bravo Cortez, seria así
     */

    final static String [][] letters = {
    {"   ##  "," ##### ","  #### "," ##### "," ######"," ######","  #### "," #    #","    #  ","      #"," #    #"," #     "," #    #"," #    #","  #### "," ##### ","  #### "," ##### ","  #### "," ##### "," #    #"," #    #"," #    #"," #    #"," #   #"," ######"},
    {"  #  # "," #    #"," #    #"," #    #"," #     "," #     "," #    #"," #    #","    #  ","      #"," #   # "," #     "," ##  ##"," ##   #"," #    #"," #    #"," #    #"," #    #"," #     ","   #   "," #    #"," #    #"," #    #","  #  # ","  # # ","     # "},
    {" #    #"," ##### "," #     "," #    #"," ##### "," ##### "," #     "," ######","    #  ","      #"," ####  "," #     "," # ## #"," # #  #"," #    #"," #    #"," #    #"," #    #","  #### ","   #   "," #    #"," #    #"," #    #","   ##  ","   #  ","    #  "},
    {" ######"," #    #"," #     "," #    #"," #     "," #     "," #  ###"," #    #","    #  ","      #"," #  #  "," #     "," #    #"," #  # #"," #    #"," ##### "," #  # #"," ##### ","      #","   #   "," #    #"," #    #"," # ## #","   ##  ","   #  ","   #   "},
    {" #    #"," #    #"," #    #"," #    #"," #     "," #     "," #    #"," #    #","    #  "," #    #"," #   # "," #     "," #    #"," #   ##"," #    #"," #     "," #   # "," #   # "," #    #","   #   "," #    #","  #  # "," ##  ##","  #  # ","   #  ","  #    "},
    {" #    #"," ##### ","  #### "," ##### "," ######"," #     ","  #### "," #    #","    #  ","  #### "," #    #"," ######"," #    #"," #    #","  #### "," #     ","  ### #"," #    #","  #### ","   #   ","  #### ","   ##  "," #    #"," #    #","   #  "," ######"}
    };

    public static void main(String[] args){
        Scanner input= new Scanner(System.in); 
        System.out.println("Escriba su nombre completo con 2 nombres y 2 apellidos: ");
        String name = input.nextLine();
        char[] initialsChar = initials(name);
        asciiArtPrint(initialsChar);
    }

    public static char[] initials(String name){
        String[] splitName = name.toUpperCase().split(" ");
        char[] initialArray = new char[4];
        int i = 0;
        for (String part: splitName){
            initialArray[i]= part.toCharArray()[0];
            i++;
        }
        return initialArray;
    }
    
    public static String stringToArraySetup (String lineOfChars, int step){
        //Used this to create -> String [][] letters
        char stringer = '"';
        String result = ""+stringer;
        for (int i=0; i<lineOfChars.length(); i++){
            if((i+1)%step!=0){
                result+= lineOfChars.toCharArray()[i];
            } else {
                result+= lineOfChars.toCharArray()[i] +""+ stringer+","+stringer;
            }
        }
        return result;
    }
    
    public static String asciiArt(char letter, int row){
        int asciiCode = 65-letter;
        return letters[row][Math.abs(asciiCode)];
    }

    public static void asciiArtPrint(char[] initials){
        for (int line =0; line<6; line++){
            for (char initial: initials){
                System.out.print(asciiArt(initial,line));
            }
            System.out.println();
        }
    }
}