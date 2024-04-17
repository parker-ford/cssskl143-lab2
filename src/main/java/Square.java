public class Square {
    private double x;
    private double y;
    private double sideLength;
    private String type = "[]";

    public Square() {
        this.x = 0;
        this.y = 0;
        this.sideLength = 0;
    }

    public Square(double x, double y) {
        this.x = x;
        this.y = y;
        this.sideLength = 0;
    }

    public Square(double x, double y, double side) {
        this.x = x;
        this.y = y;
        this.sideLength = side;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void setSideLength(double side) {
        this.sideLength = side;
    }

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getSideLength(){
        return this.sideLength;
    }
    public double getArea(){
        return this.sideLength * this.sideLength;
    }

    @Override
    public String toString() {
        return this.type;
    }

    public void draw(){
        System.out.println(this.type);
    }

}