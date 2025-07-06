import java.util.Scanner;

public class J04001_KhaiBaoLopPoint {
    private static class Point{
        private final double x,y;
        Point(double x, double y){
            this.x=x;
            this.y=y;
        }
        double distanceTo(Point other){
            return Math.hypot(this.x-other.x,this.y-other.y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-->0){
            double x1 = sc.nextDouble(), y1 = sc.nextDouble();
            double x2 = sc.nextDouble(), y2 = sc.nextDouble();
            sc.nextLine();
            Point p1 = new Point(x1,y1);
            Point p2 = new Point(x2,y2);
            System.out.printf("%.4f%n",p1.distanceTo(p2));
        }
    }
}
