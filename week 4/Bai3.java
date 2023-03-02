import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = input.nextLine();
        System.out.print("Nhập năm sinh của bạn: ");
        int yearOfBirth = input.nextInt();

        Person person = new Person(name, yearOfBirth);
        String ageGroup = person.getAgeGroup();
        System.out.println("Bạn " + name + " " + ageGroup);
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
            return " Bạn ở độ tuổi vị thành niên";
        } else if (age >= 16 && age < 18) {
            return "Bạn ở độ tuổi trưởng thành";
        } else {
            return "Bạn đã già nhưng vẫn đẹp trai";
        }
    }
}
