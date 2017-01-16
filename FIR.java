import java.util.Scanner;

public class FIR{
    public static Scanner gameScanner = new Scanner (System.in);
    private static boolean firstGame = true;
    public static void main(String[] args) {

        System.out.println("Player 1, enter your name!");
        Player player1 = new Player(gameScanner.nextLine(), "X", 1);
        System.out.println("Player 2, enter your name!");
        Player player2 = new Player(gameScanner.nextLine(), "O", 2);

        System.out.println("Let the games begin");
        System.out.println(player1.getName() + ", you are " + player1.getSymbol());
        System.out.println(player2.getName() + ", you are " + player2.getSymbol());
        System.out.println("You play the game by typing the number of the column that you want your brick to fall into.");

        while (playAgain()) {
            firstGame = false;
            GameLogic game = new GameLogic();

            game.print();


            loop:
            while (game.gameState()) {
                System.out.println(player1.getName() + ", it´s your turn.");
                game.newMove(player1, gameScanner.nextInt());
                game.print();
                if (!game.gameState()) {
                    System.out.println("Congratulations to the win, " + player1.getName() + "!!!");
                    break loop;
                }
                System.out.println(player2.getName() + ", it´s your turn.");
                game.newMove(player2, gameScanner.nextInt());
                game.print();
                if (!game.gameState()) {
                    System.out.println("Congratulations to the win, " + player2.getName() + "!!!");
                    break loop;
                }

            }


        }




    }
    private static boolean playAgain(){
        if (firstGame) {
            return true;
        }
        System.out.println("Start new game?");
        if(gameScanner.nextLine().toLowerCase().contains("yes")){
            return true;
        }
        else{
            return false;
        }
    }
}
/*****************************************************
* - GUI
* - Logic
*   - Connected4
* -
*****************************************************/
