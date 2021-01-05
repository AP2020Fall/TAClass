package sample.Models;

public class Game {
    private Board board;
    private Player[] players = new Player[2];
    private int round = 0;

    public Game() {
        players[0] = new Player("blue");
        players[1] = new Player("red");
        board = new Board();
    }

    public Player currentPlayer () {
        return players[round];
    }

    public Player[] getPlayers() {
        return players;
    }

    public void changeRound () {
        round = (round + 1) % 2;
    }

    public int[] play () {
        board.rollDice();
        int[] result = board.moveToken(currentPlayer().getToken());
        changeRound();
        return result;
    }

    public void showBoard () {
        for (int j = 0 ; j < 10; j++){
            for (int i = 0 ; i < 10; i++){
                Token token = board.getBoard()[i][j];
                if (token != null) {
                    System.out.print(token.getPlayer().getColor().charAt(0));
                }else {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
