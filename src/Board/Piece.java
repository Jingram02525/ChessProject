package Board;

public abstract class Piece {
    private boolean Dead = false;
    private boolean White = false;

    public Piece(boolean White){
        this.White = White;
    }

    public boolean isDead(boolean Dead){
        return this.Dead = Dead;
    }


}
