package sample.Models;

public class Player {
    private Token token;
    private String color;
    private boolean hasRolledDice = false;

    public boolean HasRolledDice() {
        return hasRolledDice;
    }

    public void setHasRolledDice(boolean hasRolledDice) {
        this.hasRolledDice = hasRolledDice;
    }

    public Player(String color) {
        this.color = color;
        token = new Token(this);
    }

    public Token getToken () {
        return  token;
    }

    public String getColor() {
        return color;
    }
}
