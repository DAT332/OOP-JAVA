import java.util.Scanner;

abstract class HocVien {
    private String hoten, diaChi;
    private int loaiChuongTrinh, loaiUuTien;

    public HocVien() {

    }

    public HocVien(String hoten, String diaChi, int loaiChuongTrinh, int loaiUuTien) {
        this.hoten = hoten;
        this.diaChi = diaChi;
        this.loaiUuTien = loaiUuTien;
        this.loaiChuongTrinh = loaiChuongTrinh;
    }

    public  Scanner scanner = new Scanner(System.in);

    public void NhapThongTin() {
        System.out.print("Nhap ten: ");
        hoten = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap loai uu tien: \n1. Loai 1 \n2. Loai 2\n");
        loaiUuTien = scanner.nextInt();
        // System.out.print("Nhap loai chuong trinh: \n1. Do hoa \n2. Lap trinh \n");
        // loaiChuongTrinh = scanner.nextInt();
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getHoten() {
        return hoten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setLoaiChuongTrinh(int loaiChuongTrinh) {
        this.loaiChuongTrinh = loaiChuongTrinh;
    }

    public int getLoaiChuongTrinh() {
        return loaiChuongTrinh;
    }

    public void setLoaiUuTien(int loaiUuTien) {
        this.loaiUuTien = loaiUuTien;
    }

    public int getLoaiUuTien() {
        return loaiUuTien;
    }

    public abstract long hocphi(int soBuoi, long donGia);

    public abstract long UuTien();

    public void InThongTin() {
        System.out.println("Ho ten: " + hoten);
        System.out.println("Dia Chi: " + diaChi);
        if (loaiUuTien == 1)
            System.out.println("Loai uu tien: 1");
        else if (loaiUuTien == 2)
            System.out.println("Loai uu tien: 2");
        else
            System.out.println("Loai uu tien: Khong");
    }
}

class HocVienDH extends HocVien {
    private int soBuoi;
    private long donGiaDH;

    HocVienDH() {
        
    }

    HocVienDH(String hoten, String diaChi, int loaiChuongTrinh, int loaiUuTien, int soBuoi, long donGiaDH) {
        super(hoten, diaChi, loaiChuongTrinh, loaiUuTien);
        this.soBuoi = soBuoi;
        this.donGiaDH = donGiaDH;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setDonGiaDH(long donGiaDH) {
        this.donGiaDH = donGiaDH;
    }

    public long getDonGiaDH() {
        return donGiaDH;
    }

    public void NhapThongTin() {
        super.NhapThongTin();
        System.out.print("Nhap so buoi: ");
        soBuoi = scanner.nextInt();
        System.out.print("Nhap don gia: ");
        donGiaDH = scanner.nextLong();
    };

    public long UuTien() {
        if (getLoaiUuTien() == 1)
            return 1000000;
        else if (getLoaiUuTien() == 2)
            return 500000;
        else
            return 0;
    };

    public long hocphi(int soBuoi, long donGia) {
        return this.soBuoi * this.donGiaDH - UuTien();
    };

    public void InThongTin() {
        super.InThongTin();
        System.out.println("Loai chuong trinh: Do Hoa");
        System.out.println("Hoc Phi: " + hocphi(soBuoi, donGiaDH));
    };
}

class HocVienLT extends HocVien {
    private int soBuoi;
    private long donGiaDH;

    HocVienLT() {
        
    }

    HocVienLT(String hoten, String diaChi, int loaiChuongTrinh, int loaiUuTien, int soBuoi, long donGiaDH) {
        super(hoten, diaChi, loaiChuongTrinh, loaiUuTien);
        this.soBuoi = soBuoi;
        this.donGiaDH = donGiaDH;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setDonGiaDH(long donGiaDH) {
        this.donGiaDH = donGiaDH;
    }

    public long getDonGiaDH() {
        return donGiaDH;
    }

    public void NhapThongTin() {
        super.NhapThongTin();
        System.out.print("Nhap so buoi: ");
        soBuoi = scanner.nextInt();
        System.out.print("Nhap don gia: ");
        donGiaDH = scanner.nextLong();
    };

    public long UuTien() {
        if (getLoaiUuTien() == 1)
            return 1000000;
        else if (getLoaiUuTien() == 2)
            return 800000;
        else
            return 0;
    };

    public long hocphi(int soBuoi, long donGia) {
        return this.soBuoi * this.donGiaDH - UuTien();
    };

    public void InThongTin() {
        super.InThongTin();
        System.out.println("Loai chuong trinh: Lap Trinh");
        System.out.println("Hoc Phi: " + hocphi(soBuoi, donGiaDH));
    };
}

class Bai4 {
    public static void main(String[] args) {
        HocVien hocVien[] = new HocVien[2];
        hocVien[0] = new HocVienDH();
        hocVien[0].NhapThongTin();
        hocVien[0].InThongTin();

        hocVien[1] = new HocVienLT();
        hocVien[1].NhapThongTin();
        hocVien[1].InThongTin();
    }
}