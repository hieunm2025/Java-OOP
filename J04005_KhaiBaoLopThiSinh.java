import java.util.Scanner;

public class J04005_KhaiBaoLopThiSinh {
    static class ThiSinh{
        private String hoTen;
        private String ngaySinh;
        private float diem1, diem2, diem3;

        public ThiSinh() {
        }
        
        public void nhap(Scanner sc){
            hoTen = sc.nextLine();
            ngaySinh = sc.nextLine();
            diem1 = Float.parseFloat(sc.nextLine());
            diem2 = Float.parseFloat(sc.nextLine());
            diem3 = Float.parseFloat(sc.nextLine());
        }
        
        public float tinhTongDiem(){
            return diem1 + diem2 + diem3;
        }
        
        public void xuat(){
            System.out.printf("%s %s %.1f",hoTen,ngaySinh,tinhTongDiem());
        }

        public String getHoTen() {
            return hoTen;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }
        
        public float getTongDiem(){
            return tinhTongDiem();
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
