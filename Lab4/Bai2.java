import java.io.Console;

class Truong {
    private String ten, diaChi, hieuTruong;

    public Truong() {

    }

    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChia(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getHieuTruong() {
        return hieuTruong;
    }

    public String toString() {
        return "Ten Truong: " + ten + "\nDia Chi: " + diaChi + "\nHieu Truong: " + hieuTruong + "\n";
    }
}

class SinhVien extends Nguoi {
    private String lop, nganh;
    private Truong truong = new Truong();

    public SinhVien() {

    }

    public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public String getNganh() {
        return nganh;
    }

    public Truong getTruong() {
        return truong;
    }

    public String toString() {
        return super.toString() + "Lop: " + lop + "\nNganh: " + nganh + "\n" + truong.toString();
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Truong VinhNgoc = new Truong("THCS Vinh Ngoc", "Vinh Ngoc", "Nguyen Thu Ha");
        SinhVien Hoang = new SinhVien("NN Hoang", 20, '0', "12B", "CNTT", VinhNgoc);
        System.out.print(Hoang.toString());
    }
}