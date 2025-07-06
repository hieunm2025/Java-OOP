import java.util.Scanner;
public class J01003_GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        if(a!=0){
            double x = -b/a;
            System.out.printf("%.2f\n",x);
        } else{
            if (b==0){
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        }
    }
}
