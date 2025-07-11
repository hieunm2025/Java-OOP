import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Lớp SinhVien định nghĩa cấu trúc và hành vi cho đối tượng sinh viên.
 * Chứa các phương thức để nhập, xuất, và tính toán dữ liệu liên quan.
 */
public class SinhVien {
    // Các thuộc tính được đóng gói (private)
    private String maSV;
    private String hoVaDem;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private double diem1;
    private double diem2;

    // Hàm dựng mặc định
    public SinhVien() {
    }

    // --- CÁC PHƯƠNG THỨC SETTER ---

    public void setMaSV(int number) {
        this.maSV = "D22DCCN" + String.format("%03d", number); // Đảm bảo số có 3 chữ số
    }

    public void setDiem(double diem1, double diem2) {
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    // --- CÁC PHƯƠNG THỨC GETTER VÀ TÍNH TOÁN ---

    public String getHoVaTen() {
        return this.hoVaDem + " " + this.ten;
    }

    public double getGPA() {
        return (this.diem1 + this.diem2 * 2) / 3.0;
    }

    public String getXepLoai() {
        double gpa = getGPA();
        if (gpa >= 9) return "xuat sac";
        if (gpa >= 8) return "gioi";
        if (gpa >= 6.5) return "kha";
        if (gpa >= 5) return "trung binh";
        return "yeu";
    }

 
    public void input() {
        Scanner sc = new Scanner(System.in);

        // Nhập và thiết lập mã SV
        int number = Integer.parseInt(sc.nextLine());
        setMaSV(number);

        // Nhập họ và tên
        this.hoVaDem = sc.nextLine();
        this.ten = sc.nextLine();

        // Vòng lặp kiểm tra tuổi hợp lệ (18-23)
        do {
            this.tuoi = Integer.parseInt(sc.nextLine());
            if (this.tuoi < 18 || this.tuoi > 23) {
                System.out.println("nhap sai");
            }
        } while (this.tuoi < 18 || this.tuoi > 23);

        // Nhập giới tính
        this.gioiTinh = Boolean.parseBoolean(sc.nextLine());

        // Vòng lặp kiểm tra điểm 1 hợp lệ (0-10)
        do {
            this.diem1 = Double.parseDouble(sc.nextLine());
            if (this.diem1 < 0 || this.diem1 > 10) {
                System.out.println("nhap sai");
            }
        } while (this.diem1 < 0 || this.diem1 > 10);

        // Vòng lặp kiểm tra điểm 2 hợp lệ (0-10)
        do {
            this.diem2 = Double.parseDouble(sc.nextLine());
            if (this.diem2 < 0 || this.diem2 > 10) {
                System.out.println("nhap sai");
            }
        } while (this.diem2 < 0 || this.diem2 > 10);
    }

    /**
     * Xuất thông tin sinh viên ra màn hình theo định dạng chuẩn.
     */
    public void output() {
        String gioiTinhStr = this.gioiTinh ? "nam" : "nu";
        String xepLoai = getXepLoai();
        // Định dạng GPA luôn có 1 chữ số sau dấu phẩy (ví dụ: 8.0 thay vì 8)
        DecimalFormat df = new DecimalFormat("0.0");

        // Dòng 1: Thông tin đầy đủ
        System.out.println(this.maSV + " " + getHoVaTen() + " " + this.tuoi + " " +
                gioiTinhStr + " " + df.format(getGPA()) + " " + xepLoai);

        // Dòng 2: Họ tên và xếp loại
        System.out.println(getHoVaTen() + " " + xepLoai);
    }
}