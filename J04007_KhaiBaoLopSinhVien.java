import java.util.Scanner;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float gpa;
    
    // Hàm khởi tạo không tham số
    public SinhVien() {
        this.maSV = "";
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0.0f;
    }
    
    // Getter và Setter methods
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = chuanHoaNgaySinh(ngaySinh);
    }
    
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    // Hàm chuẩn hóa ngày sinh về định dạng dd/mm/yyyy
    private String chuanHoaNgaySinh(String ngay) {
        String[] parts = ngay.split("/");
        String day = String.format("%02d", Integer.parseInt(parts[0]));
        String month = String.format("%02d", Integer.parseInt(parts[1]));
        String year = parts[2];
        return day + "/" + month + "/" + year;
    }
    
    // Hàm toString để in thông tin sinh viên
    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", 
                maSV, hoTen, lop, ngaySinh, gpa);
    }
}

public class J04007_KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tạo đối tượng sinh viên
        SinhVien sv = new SinhVien();
        
        // Đọc thông tin từ bàn phím
        String hoTen = scanner.nextLine();
        String lop = scanner.nextLine();
        String ngaySinh = scanner.nextLine();
        float gpa = scanner.nextFloat();
        
        // Gán thông tin cho sinh viên
        sv.setMaSV("B20DCCN001");
        sv.setHoTen(hoTen);
        sv.setLop(lop);
        sv.setNgaySinh(ngaySinh);
        sv.setGpa(gpa);
        
        // In thông tin sinh viên
        System.out.println(sv.toString());
        
        scanner.close();
    }
}
