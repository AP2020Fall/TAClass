package sample.Models;

import java.util.Random;

public class Board {
    private Token[][] board = new Token[10][10];
    private BoardItem[] boardItems;
    private int dice = 1;

    public Board() {
        boardItems = new BoardItem[15];
        boardItems[0] = new Snake(40, 3);
        boardItems[1] = new Ladder(4, 25);
        boardItems[2] = new Snake(27, 5);
        boardItems[3] = new Ladder(13, 46);
        boardItems[4] = new Snake(43,18);
        boardItems[5] = new Snake(54,31);
        boardItems[6] = new Ladder(33, 49);
        boardItems[7] = new Snake(99, 41);
        boardItems[8] = new Ladder(42, 63);
        boardItems[9] = new Snake(66, 45);
        boardItems[10] = new Ladder(50, 69);
        boardItems[11] = new Snake(89, 53);
        boardItems[12] = new Ladder(62, 81);
        boardItems[13] = new Ladder(74, 92);
        boardItems[14] = new Snake(76, 58);

    }

    public Token[][] getBoard() {
        return board;
    }

    public void rollDice() {
        this.dice = new Random().nextInt(6) + 1;
        System.out.println("DICE: " + dice);
    }

    public int[] moveToken(Token token) {
        int position = token.getPosition();
        board[getXOfPosition(position)][getYOfPosition(position)] = null;
        position += dice;
        int[] coords = new int[4];
        coords[0] = getXOfPosition(position);
        coords[1] = getYOfPosition(position);
        for (BoardItem item : boardItems) {
            if (item.getStart() == position) {
                position = item.getEnd();
                break;
            }
        }
        coords[2] = getXOfPosition(position);
        coords[3] = getYOfPosition(position);
        token.setPosition(position);
        board[getXOfPosition(position)][getYOfPosition(position)] = token;
        return coords;
    }

    private int getXOfPosition(int position) {
        if ((position / 10) % 2 == 0) {
            if (position % 10 == 0)
                return 0;
            return (position % 10) - 1;
        } else {
            if (position % 10 == 0)
                return 9;
            return 10 - (position % 10);
        }
    }

    private int getYOfPosition(int position) {
        return 9 - ((position-1) / 10);
    }
}
