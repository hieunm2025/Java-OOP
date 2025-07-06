import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String hoTen = scanner.nextLine();
        String gioiTinh = scanner.nextLine();       // Giới tính
        String ngaySinh = scanner.nextLine();       // Ngày sinh
        String diaChi = scanner.nextLine();         // Địa chỉ
        String maSoThue = scanner.nextLine();       // Mã số thuế
        String ngayKyHopDong = scanner.nextLine();
        
        NhanVien nv = new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi,
        maSoThue,ngayKyHopDong);
        
        nv.inThongTin();
        scanner.close();
    }
}
