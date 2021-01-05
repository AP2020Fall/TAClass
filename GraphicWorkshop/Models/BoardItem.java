package sample.Models;

public abstract class BoardItem {
    protected int start;
    protected int end;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public BoardItem(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
