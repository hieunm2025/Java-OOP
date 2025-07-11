import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Lớp SinhVien dùng để lưu trữ và xử lý thông tin của một sinh viên.
 */
class SinhVien {
    // Thuộc tính của sinh viên
    private String maSV;
    private String hoVaDem;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private double diem1;
    private double diem2;

    /**
     * Hàm dựng mặc định.
     */
    public SinhVien() {
        // Khởi tạo đối tượng rỗng
    }

    /**
     * Thiết lập mã sinh viên theo định dạng "D22DCCN" + số.
     * @param number Số nguyên để tạo mã sinh viên.
     */
    public void setMaSV(int number) {
        this.maSV = "D22DCCN" + number;
    }

    /**
     * Cập nhật điểm thành phần 1 và 2 cho sinh viên.
     * @param diem1 Điểm thứ nhất.
     * @param diem2 Điểm thứ hai.
     */
    public void setDiem(double diem1, double diem2) {
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    /**
     * Trả về họ và tên đầy đủ của sinh viên.
     * @return Chuỗi chứa họ tên đầy đủ.
     */
    public String getHoVaTen() {
        return this.hoVaDem + " " + this.ten;
    }

    /**
     * Tính điểm trung bình (GPA) theo công thức (diem1 + diem2 * 2) / 3.
     * @return Điểm GPA.
     */
    public double getGPA() {
        return (this.diem1 + this.diem2 * 2) / 3.0;
    }

    /**
     * Xếp loại học lực dựa trên điểm GPA.
     * @return Chuỗi chứa xếp loại (yeu, trung binh, kha, gioi, xuat sac).
     */
    public String getXepLoai() {
        double gpa = getGPA();
        if (gpa >= 9) return "xuat sac";
        if (gpa >= 8) return "gioi";
        if (gpa >= 6.5) return "kha";
        if (gpa >= 5) return "trung binh";
        return "yeu";
    }

    /**
     * Nhập thông tin sinh viên từ bàn phím với các ràng buộc.
     * In ra "nhap sai" nếu dữ liệu không hợp lệ và yêu cầu nhập lại.
     */
    public void input() {
        Scanner sc = new Scanner(System.in);

        // Nhập và thiết lập mã SV
        int number = Integer.parseInt(sc.nextLine());
        setMaSV(number);

        // Nhập họ và tên
        this.hoVaDem = sc.nextLine();
        this.ten = sc.nextLine();

        // Nhập tuổi (validate trong khoảng 18-23)
        do {
            this.tuoi = Integer.parseInt(sc.nextLine());
            if (this.tuoi < 18 || this.tuoi > 23) {
                System.out.println("nhap sai");
            }
        } while (this.tuoi < 18 || this.tuoi > 23);

        // Nhập giới tính
        this.gioiTinh = Boolean.parseBoolean(sc.nextLine());

        // Nhập điểm 1 (validate trong khoảng 0-10)
        do {
            this.diem1 = Double.parseDouble(sc.nextLine());
            if (this.diem1 < 0 || this.diem1 > 10) {
                System.out.println("nhap sai");
            }
        } while (this.diem1 < 0 || this.diem1 > 10);

        // Nhập điểm 2 (validate trong khoảng 0-10)
        do {
            this.diem2 = Double.parseDouble(sc.nextLine());
            if (this.diem2 < 0 || this.diem2 > 10) {
                System.out.println("nhap sai");
            }
        } while (this.diem2 < 0 || this.diem2 > 10);
    }

    /**
     * Xuất thông tin sinh viên ra màn hình theo định dạng yêu cầu.
     */
    public void output() {
        String gioiTinhStr = this.gioiTinh ? "nam" : "nu";
        String xepLoai = getXepLoai();
        DecimalFormat df = new DecimalFormat("#.0"); // Định dạng GPA 1 chữ số thập phân

        // Dòng 1: Mã SV, Họ tên, Tuổi, Giới tính, GPA, Xếp loại
        System.out.println(this.maSV + " " + getHoVaTen() + " " + this.tuoi + " " +
                gioiTinhStr + " " + df.format(getGPA()) + " " + xepLoai);

        // Dòng 2: Họ tên, Xếp loại
        System.out.println(getHoVaTen() + " " + xepLoai);
    }
}

/**
 * Lớp Main để chạy chương trình.
 */
public class TaoLopSinhVien {
    public static void main(String[] args) {
        // Tạo đối tượng sinh viên
        SinhVien sv = new SinhVien();
        
        // Gọi phương thức nhập dữ liệu
        sv.input();
        
        // Gọi phương thức xuất dữ liệu
        sv.output();
    }
}