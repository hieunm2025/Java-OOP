import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc thông tin nhân viên từ bàn phím (6 dòng)
        String hoTen = scanner.nextLine();          // Họ tên
        String gioiTinh = scanner.nextLine();       // Giới tính
        String ngaySinh = scanner.nextLine();       // Ngày sinh
        String diaChi = scanner.nextLine();         // Địa chỉ
        String maSoThue = scanner.nextLine();       // Mã số thuế
        String ngayKyHopDong = scanner.nextLine();  // Ngày ký hợp đồng

        // Tạo đối tượng NhanVien
        NhanVien nv = new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong);

        // In thông tin nhân viên
        nv.inThongTin();

        scanner.close();
    }
}
