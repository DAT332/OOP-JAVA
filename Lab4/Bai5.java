import java.nio.channels.Pipe;
import java.security.PublicKey;
import java.util.Scanner;

abstract class GiangVien {
    private String hoTen, diaChi; 
    private int loaiGiangVien;


    public GiangVien() {}

    public GiangVien(String hoTen, String diaChi, int loaiGiangVien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGiangVien = loaiGiangVien;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLoaiGiangVien(int loaiGiangVien) {
        this.loaiGiangVien = loaiGiangVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getLoaiGiangVien() {
        return loaiGiangVien;
    }

    public Scanner scanner = new Scanner(System.in);

    public void nhapThongTin() {
        System.out.println("Nhap Ho Ten Giang Vien: ");
        this.hoTen = scanner.nextLine();
        System.out.println("Nhap Dia Chi: ");
        this.diaChi = scanner.nextLine();
    }

    public abstract double TinhLuong();

    public void inThongTin() {
        System.out.println("Ho Ten: " + this.hoTen);
        System.out.println("Dia Chi: " + this.diaChi);
        if(loaiGiangVien == 1) {
            System.out.println("Loai Giang Vien: Co Huu");
        } else if (loaiGiangVien == 2) {
            System.out.println("Loai Giang Vien: Thinh Giang");
        }
        System.out.println("Luong Thang: " + TinhLuong());
    }
}

class GVThinhGiang extends GiangVien {
    private int soTiet;
    private double donGia;

    GVThinhGiang() {}

    GVThinhGiang(String hoTen, String diaChi , int soTiet, double donGia) {
        super(hoTen, diaChi, 2);
        this.soTiet = soTiet;
        this.donGia = donGia;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoTiet() {
        return soTiet;
    }
    
    public double getDonGia() {
        return donGia;
    }

    public double ThuNhap() {
        return (this.soTiet * this.donGia) * 15 / 100;
    }

    public double TinhLuong() {
        return (this.soTiet * this.donGia) - ThuNhap();
    }
}

class GVCoHuu extends GiangVien{
    private double luongCoBan;
    private double heSoLuong;
    private int thamNien;

    public GVCoHuu() {}

    public GVCoHuu(String hoTen, String diaChi, double luongCoBan, double heSoLuong, int thamNien) {
        super(hoTen, diaChi, 1);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public double PhuCap() {
        if (this.thamNien < 5) return 0;
        else if(this.thamNien >= 5) return this.thamNien * this.luongCoBan / 100;
        else return 0;
    }

    public double TinhLuong() {
        return this.luongCoBan * this.heSoLuong + PhuCap();
    }
}

public class Bai5 {
    public static void main(String[] args) {
        GVThinhGiang Thang = new GVThinhGiang("Nguyen Dai Thang", "Co Duong", 15, 200000);
        GVCoHuu Hanh = new GVCoHuu("Le Duc Hanh", "Tam Xa", 5000000, 1.4, 6);
        Thang.nhapThongTin();
        Hanh.inThongTin();
    }
}