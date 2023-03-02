import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = input.nextInt();

        NumberChecker checker = new NumberChecker(number);
        if (checker.isEven()) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
    }
}

class NumberChecker {
    private int number;

    public NumberChecker(int number) {
        this.number = number;
    }

    public boolean isEven() {
        return (number % 2 == 0);
    }
}
