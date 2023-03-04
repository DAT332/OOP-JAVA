import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int number = input.nextInt();

        NumberChecker checker = new NumberChecker(number);
        if (checker.isEven()) {
            System.out.println(number + " la so chan.");
        } else {
            System.out.println(number + " la so le.");
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
