class Nguoi {
    private String ten;
    private int tuoi;
    private char gioiTinh;

    public Nguoi() {

    }

    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    public String toString() {
        return "Ten: " + ten + "\nTuoi: " + tuoi + "\nGioi Tinh: " + gioiTinh + "\n";
    }
}

class BenhVien {
    private String ten, diaChi, giamDoc;

    public BenhVien() {

    }

    public BenhVien(String ten, String diaChi, String giamDoc) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGiamDoc() {
        return giamDoc;
    }

    public String toString() {
        return "Ten Benh Vien: " + ten + "\nDia Chi: " + diaChi + "\nGiam Doc: " + giamDoc + "\n";
    }
}

class BenhNhan extends Nguoi {
    private String tienSu, chanDoan;
    private BenhVien benhVien = new BenhVien();

    public BenhNhan() {

    }

    public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chanDoan, BenhVien benhVien) {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhVien = benhVien;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }

    String getTienSu() {
        return tienSu;
    }

    String getChanDoan() {
        return chanDoan;
    }

    BenhVien getBenhVien() {
        return benhVien;
    }

    public String toString() {
        return super.toString() + "Tien Su: " + tienSu + "\nChan Doan: " + chanDoan + "\n" + benhVien.toString();
    }
}

class Bai1 {
    public static void main(String[] args) {
        BenhVien DNA = new BenhVien("DNA", "Ha Noi", "Nguyen Nhu Hoang");
        BenhNhan nam = new BenhNhan("Nam", 15, '0', "khong", "khong", DNA);
        BenhNhan huyen = new BenhNhan("Huyen", 24, '1', "Tim", "khong", DNA);
        System.out.print(nam.toString());
    }
}