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
        
        Board.setPos(1,'X');
        Board.setPos(9,'O');
        Board.printBoard();
        Board.reset();
        Board.printBoard();

        input.close();
    }

    static class Game {


    }

    static class Board {

        static char[] pos = {
            '1','2','3',
            '4','5','6',
            '7','8','9'
        };

        
        static public void printBoard(){
            System.out.println();
            System.out.println(" "+pos[0]+" | "+pos[1]+" | "+pos[2]);
            System.out.println("---+---+---");
            System.out.println(" "+pos[3]+" | "+pos[4]+" | "+pos[5]);
            System.out.println("---+---+---");
            System.out.println(" "+pos[6]+" | "+pos[7]+" | "+pos[8]); 
            System.out.println();
        }

        static public void setPos(int there, char move){
            if (0<there&&there<10)
                pos[there-1] = move;
        }

        static public void reset(){
            for (int i=1; i<10; i++){
                setPos(i,' ');
            }
        }
    }

}