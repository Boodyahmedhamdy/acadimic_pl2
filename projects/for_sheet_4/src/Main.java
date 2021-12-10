public class Main {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("the area of c1 = " + c1.getArea());
        System.out.println("the premeter of c1 = " + c1.getPremeter());
        System.out.println("c1 contains (3, 3)? answer is " + c1.contains(3, 3));
        System.out.println("c1 contains (circle(4, 5, 10.5))? answer is " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1 overlaps (circle(3, 5, 2.3))? answer is " + c1.overLaps(new Circle2D(3, 5, 2.3)));
    }
}
class Circle2D {
    private double x;
    private double y;
    private double radius;

    // --------------- constructors ------------------
    Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // ----------------- getters --------------------
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getRadius() {
        return this.radius;
    }

    // -------------- methods -------------------
    public double getArea() {
        return (Math.PI) * Math.pow(this.radius, 2);
    }

    public double getPremeter() {
        return 2 * (Math.PI) * this.radius;
    }

    // circle equation
    // (x-a)^2 + (y-b)^2 - r^2 = 0 .. if so (a, b) on the circle
    // if res < 0 .. so (a, b) inside the circle
    // if res > 0 .. so (a, b) outside the circle

    public boolean contains(double  a, double b) {
        return (Math.pow(this.x - a, 2) + Math.pow(this.y - b, 2) - Math.pow(this.radius, 2) < 0);
    }

    public boolean contains(Circle2D circle) {
        /* the circle contain another circle
        * if the distance between its center and the other circle's center is less than
        * the main cirlce radius */
        double distance = Math.pow(this.x - circle.getY(), 2) + Math.pow(this.y - circle.getY(), 2);
        return distance < this.radius;

    }

    public boolean overLaps(Circle2D circle) {
        double distance = (Math.pow(this.x - circle.getY(), 2) + Math.pow(this.y - circle.getY(), 2));
        return distance < (this.radius + circle.getRadius()) && distance > (this.radius - circle.getRadius());
    }

}
