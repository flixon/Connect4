import java.util.Scanner;

public class FIR{
  public static void main(String[] args) {
    String [][] field = new String[15][7];
    String player1, player2;
    int cnt = 1;

    System.out.println("Player 1 enter your name!");
    Scanner player = new Scanner (System.in);
    player1 = player.nextLine();
    System.out.println("Player 2 enter your name!");
    player2 = player.nextLine();
    player.close();

    System.out.println("Let the games begin");
    System.out.println(player1 + "you are X:es.");
    System.out.println(player2 + "you are O:es.");




    for (int i = 0; i<7; i++) {
        for (int j = 0; j<15; j++) {
            if (i==0 && j%2==1) {
                field[j][i] = Integer.toString(cnt);
                cnt++;
            }
            else if (j%2==0) {
                field[j][i]="|";
            }
            else if(j%2==1){
                field[j][i] = " ";
            }
            System.out.print(field[j][i]);
        }
        System.out.println();
    }




  }
}
/*****************************************************
* - GUI
* - Logic
*   - Connected4
* -
*****************************************************/
