import java.util.*;

class Tour {
    private String ma,tu,den;
    private double  gia;
    private int soNguoi;

    public Tour(String tu, String den, double gia, int soNguoi) {
        this.tu = tu;
        this.den = den;
        this.gia = gia;
        this.soNguoi = soNguoi;
    }
    
    public void setMa(int index){
        this.ma = String.format("T%03d",index);
    }

    public String getMa() {
        return ma;
    }
    public double getThanhTien(){
        double thanhTien = gia * soNguoi;
        if(soNguoi > 10){
            thanhTien *= 0.8;
        } else if (soNguoi >= 6){
            thanhTien *= 0.9;
        }
        return thanhTien;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.0f %d %.0f",ma,tu,den,gia,soNguoi,getThanhTien());
    }
}

