package battleship;


public interface Moves {
    public void Move(int x,char y);
    public boolean isHit();
    public boolean isSunk();
}
