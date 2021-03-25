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
        
        Board.setPos(0,1,'X');
        Board.setPos(2,1,'O');
        Board.printBoard();
        Board.reset();
        Board.printBoard();

        input.close();
    }

    static class Game {

    }

    static class Board {

        static char[][] pos = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
        };

        
        static public void printBoard(){
            System.out.println(" "+pos[0][0]+" | "+pos[0][1]+" | "+pos[0][2]);
            System.out.println("---+---+---");
            System.out.println(" "+pos[1][0]+" | "+pos[1][1]+" | "+pos[1][2]);
            System.out.println("---+---+---");
            System.out.println(" "+pos[2][0]+" | "+pos[2][1]+" | "+pos[2][2]); 
        }

        static public void setPos(int posX, int posY, char move){
            pos[posX][posY] = move;
        }

        static public void reset(){
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++)
                    pos[i][j]=' ';
            }
        }



    }
}