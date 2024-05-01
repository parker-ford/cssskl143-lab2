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
        double test = 5;
        this.y = x * 4;
    }
    public void setY(double y) {
        this.x = y * 2;
    }

    public void testMethod(int a, int b) {

        int test = 0;

        for (;true;){
            break;
        }

        if (a < b) {
            // Do something
            System.out.println("a is less than b");
        } else if (a == b) {
            // Do something else
            System.out.println("a is equal to b");
        } else {
            // Yet another thing
            if (b > 5) {
                // Nested condition
                //System.out.println("b is greater than 5");
            }
        }

        for (int i = 0; i < 100; i++) {
            String example = new String("Repeated String");
            System.out.println(example);
        }
    }

    public void complilcateMethod() {
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;

        if (a < b) {
            if (b < c) {
                if (c < d) {
                    System.out.println("a is less than b, b is less than c, and c is less than d");
                }
            }
        }
    }

//    public void setRadius(double radius) {
//        this.radius = radius;
//    }

    public double getX(){
        return this.x;
    }
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