public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
        //System.out.println("Empty constructor called.");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double distance = Math.sqrt((y-0)*(y-0) + (x-0)*(x-0));
        return distance;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt((this.y-y)*(this.y-y) + (this.x-x)*(this.x-x));
        return distance;
    }

    public double distance(Point p) {
        double distance = Math.sqrt((this.y-p.getY())*(this.y-p.getY()) + (this.x-p.getX())*(this.x-p.getX()));
        return distance;
    }
}
