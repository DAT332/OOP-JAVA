import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        double num1 = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double num2 = sc.nextDouble();

        // Tính tổng, hiệu, tích, thương, chia lấy dư
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;

        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        System.out.println("Thuong: " + quotient);
        System.out.println("Chia lay du: " + remainder);

        // So sánh 2 số
        if (num1 > num2) {
            System.out.println(num1 + " lon hon " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " nho hon " + num2);
        } else {
            System.out.println(num1 + " bang " + num2);
        }
    }
}
