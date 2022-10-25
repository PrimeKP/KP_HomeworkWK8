package kpatel_homeworkwk8;

public class P_Point {

    private int x;
    private int y;

    public P_Point() {
    }

    public P_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {

        return distance(0, 0);
    }

    public double distance(int x, int y) {

        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(P_Point secondPoint) {

        return distance(secondPoint.x, secondPoint.y);
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

    public static void main(String[] args) {

        P_Point first = new P_Point(6, 5);

        P_Point second = new P_Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        P_Point point = new P_Point();

        System.out.println("distance()= " + point.distance());

    }
}