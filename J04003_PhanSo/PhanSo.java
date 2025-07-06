class PhanSo {
    private long tu;
    private long mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
        rutGon(); 
    }

    private long gcd(long a, long b) {
        long r;  // Khai báo biến r
        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private void rutGon() {
        long g = gcd(Math.abs(tu), Math.abs(mau));  // Sử dụng giá trị tuyệt đối
        tu /= g;
        mau /= g;
        
        // Đảm bảo mẫu số luôn dương
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }

    public void inPhanSo() {
        System.out.printf("%d/%d\n", tu, mau);
    }
}