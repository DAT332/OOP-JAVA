import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong so nguyen: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so nguyen thu " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / n;

        System.out.println("Trung binh cong cua " + n + " so nguyen la  " + average);

        scanner.close();
    }
}
