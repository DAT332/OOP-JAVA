import java.util.Scanner;
import java.lang.Math;

class Diem {
    private
        double x, y;
    public
        Scanner input = new Scanner(System.in);
        void Nhapdiem() {
            System.out.print("x= ");
            x = input.nextInt();
            System.out.print("y= ");
            y = input.nextInt();
        }
        double DoDai(Diem A, Diem B) {
            return Math.sqrt(Math.pow((B.x - A.x), 2) + Math.pow((B.y - A.y), 2));
        }
}

class TamGiac extends Diem {
    private
        Diem A = new Diem(), B = new Diem(), C = new Diem();
    public
        Scanner input = new Scanner(System.in);
        void NhapTG() {
            A.Nhapdiem();
            B.Nhapdiem();
            C.Nhapdiem();
        }
        boolean KiemTra() {
            if(DoDai(A,B) + DoDai(B,C) > DoDai(C,A) && DoDai(B,C) + DoDai(C,A) > DoDai(A,B) 
            && DoDai(C,A) + DoDai(A,B) > DoDai(B,C)) return true;
            else return false;
        }
        double ChuVi() {
            return (DoDai(A,B) + DoDai(B,C) + DoDai(C,A));
        }
        double DienTich() {
            double p = ((DoDai(A,B) + DoDai(B,C) + DoDai(C,A)) / 2);
            return Math.sqrt(p * (p - DoDai(A,B)) * (p - DoDai(B,C)) * (p - DoDai(C,A)));
        }
}

class DuongTron extends Diem {
    private
        Diem O = new Diem();
        double r;
    public
        void NhapDT() {
            System.out.print("Nhap Toa Do Tam: ");
            O.Nhapdiem();
            System.out.print("Nhap Ban Kinh: ");
            r = input.nextDouble();
        }
        double ChuVi() {
            return (2 * 3.14 * r);
        }
        double DienTich() {
            return (3.14 * r * r);
        }
}

public class Bai32 {
    public static void main(String[] args) {
        TamGiac ABC = new TamGiac();
        ABC.NhapTG();
        if(ABC.KiemTra()) System.out.println("ABC la Tam Giac");
        else System.out.print("ABC Khong Phai Tam Giac");
        System.out.println("Chu Vi Tam Giac la:" + ABC.ChuVi()); 
        System.out.println("Dien Tich Tam Giac la:" + ABC.DienTich()); 

        DuongTron O = new DuongTron();
        O.NhapDT();
        System.out.println("Chu Vi Duong Tron la:" + O.ChuVi()); 
        System.out.println("Dien Tich Duong Tron la:" + O.DienTich()); 
    }
}