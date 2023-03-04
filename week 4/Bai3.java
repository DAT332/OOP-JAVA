import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        String name = input.nextLine();
        System.out.print("Nhap nam sinh cua ban: ");
        int yearOfBirth = input.nextInt();

        Person person = new Person(name, yearOfBirth);
        String ageGroup = person.getAgeGroup();
        System.out.println("Ban " + name + " " + ageGroup);
    }
}

class Person {
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getAgeGroup() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int age = currentYear - yearOfBirth;

        if (age < 16) {
            return " Ban o do tuoi vi thanh nien";
        } else if (age >= 16 && age < 18) {
            return "Ban o do tuoi truong thanh";
        } else {
            return "Ban da gia nhung van dep trai";
        }
    }
}
