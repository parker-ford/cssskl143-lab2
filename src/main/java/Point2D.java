public class Point2D {
    private int x;
    private int y;

    public void setX(int nX){
        this.x = nX;
    }
    public void setY(int nY){
        this.y = nY;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void resetToOrigin(){
        this.x = 0;
        this.y = 0;
    }
    public void translate(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }

    public boolean equals(Point2D other){
        return this.x == other.x && this.y == other.y;
    }
}