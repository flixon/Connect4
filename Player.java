public class Player{
    private String name, symbol;
    private int wins, losses, playerNum;

    public Player(String name,String symbol, int playerNum){
        this.playerNum = playerNum;
        this.name = name;
        this.symbol = symbol;
        wins = 0;
        losses = 0;

    }

    public void newLoss(){
        losses++;
    }
    public void newWin(){
        //System.out.println("Congratulations to the win, " + name + "!!!");
        wins++;
    }
    public int getWins(){
        return wins;
    }
    public int getLosses(){
        return losses;
    }
    public String getName(){
        return name;
    }
    public String getSymbol(){
        return symbol;
    }

}
