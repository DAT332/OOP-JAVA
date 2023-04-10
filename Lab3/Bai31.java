import java.util.Scanner;

class Sach 
    {
        Scanner input = new Scanner (System.in);
        private
            String ma, ten, tg;
            int trang, tap, gia;
            String loai, nxb;
        public
            void NhapSach()
            {
                System.out.print("Nhap Ma Sach: ");
                ma = input.nextLine();
                System.out.print("Nhap Ten Sach: ");
                ten = input.nextLine();
                System.out.print("Nhap Ten Tac Gia: ");
                tg = input.nextLine();
                System.out.print("Nhap loai sach: ");
                loai = input.nextLine();
                System.out.print("Nhap Ten NXB: ");
                nxb = input.nextLine();
                System.out.print("Nhap so trang: ");
                trang = input.nextInt();
                System.out.print("Nhap so tap: ");
                tap = input.nextInt();
                System.out.print("Nhap gia: ");
                gia = input.nextInt();
            }
            void InSach() {
                System.out.println("Ma Sach: " + ma);
                System.out.println("Ten Sach: " + ten);
                System.out.println("Ten tac gia: " + tg);
                System.out.println("Loai sach: " + loai);
                System.out.println("Nha Xuan Ban: " + nxb);
                System.out.println("So trang: " + trang);
                System.out.println("So tap: " + tap);
                System.out.println("Gia: " + gia);
            }
    }

public class Bai31 {
    public static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        // Sach SACH = new Sach();
        // SACH.NhapSach();
        // SACH.InSach();
        System.out.print("Nhap so luong sach:");
        int n = input.nextInt();
        Sach DsSach[] = new Sach[n] ;
        for(int i = 0; i < n; i++) {
            DsSach[i] = new Sach();
            System.out.println("Nhap thong tin sach thu "+ (i+1));
            DsSach[i].NhapSach();
        }
        for(int i = 0; i < n; i++) {
            System.out.println("Thong tin quyen sach thu " + (i+1));
            DsSach[i].InSach();
        }
    }
}