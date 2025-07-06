import java.util.Scanner;
public class J04004_TongPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextLong();
        long mau1 = sc.nextLong();
        
        long tu2 = sc.nextLong();
        long mau2 = sc.nextLong();
        
        //Sum 
        //a/b + c/d = (a*d+c*b)/(b*d)
        long tuTong = tu1*mau2+tu2*mau1;
        long mauTong = mau1*mau2;
        
        long ucln = timUCLN(tuTong,mauTong);
        tuTong = tuTong / ucln;
        mauTong = mauTong / ucln;
        System.out.println(tuTong + "/" + mauTong);
    }
    public static long timUCLN(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
