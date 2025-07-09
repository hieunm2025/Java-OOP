import java.util.Scanner;

public class J04007_KhaiBaoLopNhanVien {
    static class NhanVien{
        private String maNV;
        private String hoTen;
        private String gioiTinh;
        private String ngaySinh;
        private String diaChi;
        private String maSoThue;
        private String ngayKyHopDong;

        public NhanVien() {
            this.maNV = "00001";
        }
        
        public void nhap(Scanner sc){
            hoTen = sc.nextLine();
            gioiTinh = sc.nextLine();
            ngaySinh = sc.nextLine();
            diaChi = sc.nextLine();
            maSoThue = sc.nextLine();
            ngayKyHopDong = sc.nextLine();
        }
        
        public void xuat(){
            System.out.printf("%s %s %s %s %s %s %s",maNV,hoTen,gioiTinh,ngaySinh,diaChi,maSoThue,ngayKyHopDong);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        nv.nhap(sc);
        nv.xuat();
        sc.close();
    }
}
