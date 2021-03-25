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
        
        Board.setPos(1,'x');
        Board.setPos(2,'x');
        Board.setPos(3,'x');
        Board.printBoard();
        char winner = Game.calculateWinner(Board.getPos());
        System.out.println("The winner is: "+winner);
        Board.reset();
        Board.setPos(1,'x');
        Board.setPos(2,'o');
        Board.setPos(3,'x');
        winner = Game.calculateWinner(Board.getPos());
        System.out.println("The winner is: "+winner);
        Board.printBoard();

        input.close();
    }

    static class Game {

        static char calculateWinner(char[] squares){
            final int[][] LINES = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {0, 3, 6},
                {1, 4, 7},
                {2, 5, 8},
                {0, 4, 8},
                {2, 4, 6},
            };

            for (int i = 0; i < LINES.length; i++) {
                int a = LINES[i][0];
                int b = LINES[i][1];
                int c = LINES[i][2];
                if (squares[a] == squares[b] && squares[a] == squares[c]) {
                  return squares[a];
                }
              }

            return ' ';
        }
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
                setPos(i,(char) (i+ '0'));
            }
        }

        static public char[] getPos(){
            return pos;
        }
    }

}