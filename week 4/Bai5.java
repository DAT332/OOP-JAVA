import java.util.Scanner;

public class Bai5 {
    private int sum;
    private Scanner scanner;

    public Bai5() {
        this.sum = 0;
        this.scanner = new Scanner(System.in);
    }

    public void calculateSum() {
        int num;
        do {
            System.out.print("Nhap mot so nguyen: ");
            num = scanner.nextInt();
            sum += num;
        } while (sum <= 100);
        System.out.println("Tong cac so nguyen da nhap la" + sum);
    }

    public static void main(String[] args) {
        Bai5 calculator = new Bai5();
        calculator.calculateSum();
    }
}
