import java.util.Random;
import java.util.Scanner;

public class TikTakToeGame {

    public static void main (String[] args){
        String[] playersName = new String[2];
        Scanner input= new Scanner(System.in); 
        System.out.println("Ingrese nombre del jugador 1: ");
        playersName[0] = input.nextLine();
        System.out.println("Ingrese nombre del jugador 2: ");
        playersName[1] = input.nextLine();
        Random random = new Random();
        int initialPlayer = (random.nextFloat()<0.5)?0:1;
        System.out.println("Comenzará el jugador "+(initialPlayer+1)+" : "+playersName[initialPlayer]);
    }

    class Game {

    }

    class Board {

        char[][] positions = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
        };

         //constructor
        public Board(){
             
        }



    }
}