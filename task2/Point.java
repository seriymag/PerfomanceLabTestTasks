public class Point {

    double x;
    double y;
    int location;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public String getInfo() {
        String x = Double.toString(getX());
        String y = Double.toString(getY());
        String location = Double.toString(getLocation());
        return x + " " + y + " " + location;

    }

    @Override
    public String toString() {
        return getInfo();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
