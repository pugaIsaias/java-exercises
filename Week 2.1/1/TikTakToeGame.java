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
        int otherPlayer = (initialPlayer == 0)? 1: 0;
        System.out.println("Comenzará el jugador "+(initialPlayer+1)+" : "+playersName[initialPlayer]);
        
        Game game = new Game(playersName[initialPlayer],playersName[otherPlayer]);
        game.gameLoop();
        
        input.close();
    }

   
    
}

class Game {

    private int turn = 0;
    private String[] players = new String[2];
    private static final char[] MARK = {'x','o'};
    private Board board;

    //constructor
    public Game(String player1, String player2){
        this.players[0] = player1;
        this.players[1] = player2; 
        board = new Board();
    }

    void printTurnOf(){
        System.out.println("Turno de "+players[turn%2]+" y esta utiliza : "+MARK[turn%2]);
    }

    void printWinner(){
        char mark = calculateWinner(board.getPos());
        int number = (mark == 'x')?0:1;
        System.out.println("El ganador es: "+ players[number]+"! | con : "+MARK[number]);
    }

    void gameLoop(){
        Scanner input= new Scanner(System.in); 
        int move;
        while(calculateWinner(board.getPos())==' '){

            printTurnOf();
            this.board.printBoard();
            move = input.nextInt();
            if(!this.board.isValidPos(move)){
                while(!this.board.isValidPos(move)){
                    System.out.println("Movimiento invalido intente de nuevo.");
                    move = input.nextInt();
                    this.board.printBoard();
                }
            }
            this.board.setPos(move, MARK[turn%2]);
            this.turn++;

        }
        input.close();
        this.board.printBoard();
        printWinner();
    }

    char calculateWinner(char[] squares){
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


class Board {

    char[] pos = {
        '1','2','3',
        '4','5','6',
        '7','8','9'
    };

    
    public void printBoard(){
        System.out.println();
        System.out.println(" "+pos[0]+" | "+pos[1]+" | "+pos[2]);
        System.out.println("---+---+---");
        System.out.println(" "+pos[3]+" | "+pos[4]+" | "+pos[5]);
        System.out.println("---+---+---");
        System.out.println(" "+pos[6]+" | "+pos[7]+" | "+pos[8]); 
        System.out.println();
    }

    public boolean isValidPos(int there){
        if(((pos[there-1]!='x') && (pos[there-1]!='o')) && ((0<there) && (there<10)))
            return true;
        return false;
    }

    public void setPos(int there, char mark){
        if (isValidPos(there))
            pos[there-1] = mark;
    }

    public void reset(){
        for (int i=1; i<10; i++){
            setPos(i,(char) (i+ '0'));
        }
    }

    public char[] getPos(){
        return pos;
    }
}
