public class NhanVien {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHopDong;

    // Hàm khởi tạo không tham số
    public NhanVien() {
        this.maNV = "00001";
        this.hoTen = "";
        this.gioiTinh = "";
        this.ngaySinh = "";
        this.diaChi = "";
        this.maSoThue = "";
        this.ngayKyHopDong = "";
    }

    // Hàm khởi tạo có tham số
    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHopDong) {
        this.maNV = "00001"; // Gán mặc định mã nhân viên
        this.hoTen = chuanHoaTen(hoTen);
        this.gioiTinh = gioiTinh;
        this.ngaySinh = chuanHoaNgay(ngaySinh);
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKyHopDong = chuanHoaNgay(ngayKyHopDong);
    }

    // Phương thức chuẩn hóa tên - viết hoa chữ cái đầu của từng từ
    private String chuanHoaTen(String ten) {
        if (ten == null || ten.trim().isEmpty()) {
            return "";
        }
        
        String[] words = ten.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                // Viết hoa chữ cái đầu, viết thường các chữ cái còn lại
                String word = words[i].substring(0, 1).toUpperCase() + 
                             words[i].substring(1).toLowerCase();
                result.append(word);
                
                // Thêm khoảng trống giữa các từ (trừ từ cuối cùng)
                if (i < words.length - 1) {
                    result.append(" ");
                }
            }
        }
        
        return result.toString();
    }

    // Phương thức chuẩn hóa ngày về định dạng dd/mm/yyyy
    private String chuanHoaNgay(String ngay) {
        if (ngay == null || ngay.trim().isEmpty()) {
            return "";
        }
        
        String[] parts = ngay.trim().split("/");
        if (parts.length != 3) {
            return ngay; // Trả về nguyên bản nếu không đúng định dạng
        }
        
        try {
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);
            
            // Định dạng lại với 2 chữ số cho ngày và tháng
            return String.format("%02d/%02d/%04d", day, month, year);
        } catch (NumberFormatException e) {
            return ngay; // Trả về nguyên bản nếu không parse được
        }
    }

    // Phương thức in thông tin nhân viên
    public void inThongTin() {
        System.out.printf("%s %s %s %s %s %s %s%n", maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong);
    }
}
