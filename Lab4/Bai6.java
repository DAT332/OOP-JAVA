import java.util.Scanner;

abstract class CongNhan {
    private String hoTen, diaChi;
    private String ngaySinh;
    private int loaiCongNhan;

    public CongNhan() {}

    public CongNhan(String hoTen ,String ngaySinh ,String diaChi, int loaiCongNhan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.loaiCongNhan = loaiCongNhan;
    }

    public Scanner scanner = new Scanner(System.in);

    public void NhapThongTin() {
        System.out.println("Nhap Ho Ten: ");
        this.hoTen = scanner.nextLine();
        System.out.println("Nhap Ngay Sinh: ");
        this.ngaySinh = scanner.nextLine();
        System.out.println("Nhap Dia Chi: ");
        this.diaChi = scanner.nextLine();
    }

    public abstract double TinhLuong();

    public void inThongTin() {
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Ngay Sinh: " + this.ngaySinh);
        System.out.println("Dia Chi: " + this.diaChi);
        if(loaiCongNhan == 1) System.out.println("Loai Cong Nhan: CNKSP");
        else if (loaiCongNhan == 2) System.out.println("Loai Cong Nhan: CNTCN");
        System.out.println("Luong: " + TinhLuong()); 
    }
}

class CNKSP extends CongNhan {
    private int soSanPham;
    private double donGia;

    public CNKSP() {}

    public CNKSP(String hoTen ,String ngaySinh ,String diaChi, int soSanPham, double donGia) {
        super(hoTen, ngaySinh, diaChi, 1);
        this.soSanPham = soSanPham;
        this.donGia = donGia;
    }

    public double Thuong() {
        if(this.soSanPham < 100) return 0;
        else if(this.soSanPham >= 100 && this.soSanPham < 150) return 1000000;
        else if(this.soSanPham >= 150) return 1500000;
        else return 0;
    }

    public void NhapThongTin() {
        super.NhapThongTin();
        System.out.println("Nhap So San Pham: ");
        this.soSanPham = scanner.nextInt();
        System.out.println("Nhap Don Gia San Pham: ");
        this.donGia = scanner.nextDouble();
    }

    public double TinhLuong() {
        return this.soSanPham * this.donGia + Thuong();
    }
}

class CNTCN extends CongNhan {
    private double luongCoBan, heSoLuong;
    private int ngayCong;

    public CNTCN() {}

    public CNTCN(String hoTen ,String ngaySinh ,String diaChi, double luongCoBan, double heSoLuong, int ngayCong) {
        super(hoTen, ngaySinh, diaChi, 2);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.ngayCong = ngayCong;
    }

    public double Thuong() {
        if(this.ngayCong < 20) return 0;
        else if(this.ngayCong >= 20) return 1.2 * this.luongCoBan;
        else return 0;
    }

    public void NhapThongTin() {
        super.NhapThongTin();
        System.out.println("Nhap Luong Co Ban: ");
        this.luongCoBan = scanner.nextDouble();
        System.out.println("Nhap He So Luong: ");
        this.heSoLuong = scanner.nextDouble();
        System.out.println("Nhap Ngay Cong: ");
        this.ngayCong = scanner.nextInt();
    }

    public double TinhLuong() {
        return this.luongCoBan * this.heSoLuong + Thuong();
    }
}

public class Bai6 {
    public static void main(String[] args) {
        CNKSP Hoang = new CNKSP("Hoang", "21/03/2003" , "Dong Anh", 15, 150000);
        Hoang.inThongTin();
        CNTCN Thang = new CNTCN("Thang", "30/04/2002", "Dong Anh", 5000000, 1.2, 22);
        Thang.inThongTin();
    }
}