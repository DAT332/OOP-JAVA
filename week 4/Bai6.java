import java.util.Scanner;

public class Bai6 {
    private int num;
    private Scanner scanner;

    public Bai6() {
        this.scanner = new Scanner(System.in);
    }

    public void readNumber() {
        System.out.print("Nhap mot so nguyen duong ");
        this.num = scanner.nextInt();
    }

    public int calculateFactorial() {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Bai6 calculator = new Bai6();
        calculator.readNumber();
        int factorial = calculator.calculateFactorial();
        System.out.println("Giai thua cua " + calculator.num + " la " + factorial);
    }
}
