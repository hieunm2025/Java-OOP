import java.util.Scanner;

public class J04008_ChuViTamGiac {
    static double dist(double x1, double y1, double x2, double y2){
        return Math.hypot(x1 - x2,y1 - y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double x1 = sc.nextDouble(), y1= sc.nextDouble();
            double x2= sc.nextDouble(), y2 = sc.nextDouble();
            double x3 = sc.nextDouble(), y3 = sc.nextDouble();
            
            double a = dist(x1,y1,x2,y2);
            double b = dist(x2,y2,x3,y3);
            double c = dist(x3,y3,x1,y1);
            
            if (a + b > c && b + c > a && c + a > b){
                System.out.printf("%.3f%n",a+b+c);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
