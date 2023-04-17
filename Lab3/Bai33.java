import java.util.ArrayList;
import java.util.Scanner;

class NgayThang {
    int ngay;
    int thang;
    int nam;

    void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        ngay = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        thang = scanner.nextInt();
        System.out.print("Nhập năm: ");
        nam = scanner.nextInt();
    }

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}

abstract class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected String nhaSanXuat;
    protected double gia;

    abstract void nhap();

    @Override
    public String toString() {
        return "Mã hàng: " + maHang + ", Tên hàng: " + tenHang + ", Nhà sản xuất: " + nhaSanXuat + ", Giá: " + gia;
    }
}

class HangDienMay extends HangHoa {
    int thoiGianBaoHanh;
    double dienAp;
    double congSuat;

    @Override
    void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        maHang = scanner.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang = scanner.nextLine();
        System.out.print("Nhập nhà sản xuất: ");
        nhaSanXuat = scanner.nextLine();
        System.out.print("Nhập giá: ");
        gia = scanner.nextDouble();
        System.out.print("Nhập thời gian bảo hành (tháng): ");
        thoiGianBaoHanh = scanner.nextInt();
        System.out.print("Nhập điện áp: ");
        dienAp = scanner.nextDouble();
        System.out.print("Nhập công suất: ");
        congSuat = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + ", Thời gian bảo hành: " + thoiGianBaoHanh + " tháng, Điện áp: " + dienAp + ", Công suất: " + congSuat;
    }
}

class HangSanhSu extends HangHoa {
    String loaiNguyenLieu;

    @Override
    void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        maHang = scanner.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang = scanner.nextLine();
        System.out.print("Nhập nhà sản xuất: ");
        nhaSanXuat = scanner.nextLine();
        System.out.print("Nhập giá: ");
        gia = scanner.nextDouble();
        System.out.print("Nhập loại nguyên liệu: ");
        loaiNguyenLieu = scanner.next();
    }

    @Override
    public String toString() {
        return super.toString() + ", Loại nguyên liệu: " + loaiNguyenLieu;
    }
}

class HangThucPham extends HangHoa {
    NgayThang ngaySanXuat;
    NgayThang ngayHetHan;

    @Override
    void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        maHang = scanner.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang = scanner.nextLine();
        System.out.print("Nhập nhà sản xuất: ");
        nhaSanXuat = scanner.nextLine();
        System.out.print("Nhập giá: ");
        gia = scanner.nextDouble();

        System.out.println("Nhập ngày sản xuất:");
        ngaySanXuat = new NgayThang();
        ngaySanXuat.nhap();

        System.out.println("Nhập ngày hết hạn:");
        ngayHetHan = new NgayThang();
        ngayHetHan.nhap();
    }

    @Override
    public String toString() {
        return super.toString() + ", Ngày sản xuất: " + ngaySanXuat.toString() + ", Ngày hết hạn: " + ngayHetHan.toString();
    }
}

class Bai33 {
    ArrayList<HangHoa> dsHH;

    Bai33() {
        dsHH = new ArrayList<>();
    }

    void nhapHang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng hàng hóa: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập loại hàng hóa (1: Hàng điện máy, 2: Hàng sành sứ, 3: Hàng thực phẩm): ");
            int loai = scanner.nextInt();
            HangHoa hh;
            switch (loai) {
                case 1:
                    hh = new HangDienMay();
                    break;
                case 2:
                    hh = new HangSanhSu();
                    break;
                case 3:
                    hh = new HangThucPham();
                    break;
                default:
                    System.out.println("Loại hàng hóa không hợp lệ, vui lòng nhập lại.");
                    i--;
                    continue;
            }
            hh.nhap();
            dsHH.add(hh);
        }
    }

    void inDSHang() {
        System.out.println("Danh sách hàng hóa:");
        for (HangHoa hh : dsHH) {
            System.out.println(hh);
        }
    }

    public static void main(String[] args) {
        Bai33 program = new Bai33();
        program.nhapHang();
        program.inDSHang();
    }
}