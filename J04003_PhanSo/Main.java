import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        
        if (mau == 0) {  // Chỉ kiểm tra mẫu số khác 0
            System.out.println("INVALID");
            return;
        }

        PhanSo ps = new PhanSo(tu, mau);
        ps.inPhanSo();

        sc.close();
    }
}