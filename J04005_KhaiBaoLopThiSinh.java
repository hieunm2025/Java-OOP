import java.util.Scanner;

public class J04005_KhaiBaoLopThiSinh {
    static class ThiSinh{
        String hoTen;
        String ngaySinh;
        float diem1,diem2,diem3;
        
        public void nhap(Scanner sc){
            hoTen = sc.nextLine();
            ngaySinh = sc.nextLine();
            diem1 = Float.parseFloat(sc.nextLine());
            diem2 = Float.parseFloat(sc.nextLine());
            diem3 = Float.parseFloat(sc.nextLine());
        }
        public void xuat(){
            float tong = diem1 + diem2 + diem3;
            System.out.printf("%s %s %.1f",hoTen,ngaySinh,tong);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh();
        ts.nhap(sc);
        ts.xuat();
        sc.close();
    }
}
