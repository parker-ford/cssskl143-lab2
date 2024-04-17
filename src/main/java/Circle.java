public class Circle {
    private double x;
    private double y;
    private double radius;
    private String type = "O";

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 0;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//    public double getX(){
//        return this.x;
//    }
    public double getY(){
        return this.y;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return type;
    }

    public void draw(){
        System.out.println(this.type);
    }

}