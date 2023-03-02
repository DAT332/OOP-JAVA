import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double num1 = sc.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double num2 = sc.nextDouble();

        // Tính tổng, hiệu, tích, thương, chia lấy dư
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;

        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        System.out.println("Thương: " + quotient);
        System.out.println("Chia lấy dư: " + remainder);

        // So sánh 2 số
        if (num1 > num2) {
            System.out.println(num1 + " lớn hơn " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " nhỏ hơn " + num2);
        } else {
            System.out.println(num1 + " bằng " + num2);
        }
    }
}
