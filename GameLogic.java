import java.util.Scanner;

public class GameLogic {

    private static  String [][] field = new String[7][6];
    private String [][] printField = new String[15][7];
    private String player1Brick, player2Brick;
    private static boolean continueGame, player1Win, player2Win;
    private static int numRounds = 0;
    public static Scanner gameScanner = new Scanner (System.in);

    public GameLogic(){
        continueGame = true;
        numRounds = 0;
        for (int i = 0; i<6; i++) {
            for (int j = 0; j<7; j++) {
                field[j][i] = " ";
            }
        }
    }
    public void newMove(Player player, int row){
        row = row -1;
        moveLoop:
        for (int i = 5; i>=0; i--) {
            if (field[row][i].contains(" ")) {
                field[row][i] = player.getSymbol();
                break moveLoop;
            }
            else if (i==0) {
                System.out.println("That column if full, please choose a new one.");
                newLocalMove(player, gameScanner.nextInt());
            }
        }



        numRounds++;
    }
    public static void newLocalMove(Player player, int row){
        row = row -1;
        moveLoop:
        for (int i = 5; i>=0; i--) {
            if (field[row][i].contains(" ")) {
                field[row][i] = player.getSymbol();
                break moveLoop;
            }
            else if (i==0) {
                System.out.println("That column if full, please choose a new one.");
                newLocalMove(player, gameScanner.nextInt());
            }
        }



        numRounds++;
    }
    public void print(){
        int cnt = 1;
        int cntJ = 0;
        int cntI = -1;
        for (int i = 0; i<7; i++) {
            for (int j = 0; j<15; j++) {
                if (i==0 && j%2==1) {
                    printField[j][i] = Integer.toString(cnt);
                    cnt++;
                }
                else if (j%2==0) {
                    printField[j][i]="|";
                }
                else if(j%2==1 && i>0){
                    printField[j][i] = field[cntJ][cntI];
                    cntJ++;
                }
                System.out.print(printField[j][i]);
            }
            System.out.println();
            cntI++;
            cntJ = 0;
        }
    }
    public boolean gameState(){
        if (numRounds == 7*6) {
            return false;
        }
        // else if (player1Win) {
        //     return false;
        // }
        // else if (player2Win){
        //     return false;
        // }
        else {
            return true;
        }
    }
    public static boolean gameLocalState(){
        if (numRounds == 7*6) {
            return false;
        }
        else if (player1Win) {
            return false;
        }
        else if (player2Win){
            return false;
        }
        else {
            return true;
        }
    }
}
