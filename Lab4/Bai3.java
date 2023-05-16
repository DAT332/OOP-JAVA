class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {

    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\n";
    }
}

class Employee extends Person {
    private String employerName;
    private String dateHired;

    public Employee() {

    }

    public Employee(String name, int age, char gender, String employerName, String dateHired) {
        super(name, age, gender);
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getDateHired() {
        return dateHired;
    }

    public String toString() {
        return super.toString() + "Employer Name: " + employerName + "\nDate Hired: " + dateHired + "\n";
    };
}

class PartTimeEmployee extends Employee {
    private int hoursPerWeek;

    public PartTimeEmployee() {

    }

    public PartTimeEmployee(String name, int age, char gender, String employerName, String dateHired, int hoursPerWeek) {
        super(name, age, gender, employerName, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public String toString() {
        return super.toString() + "Hours Per Week: " + hoursPerWeek + "\n";
    }
}

public class Bai3 {
    public static void main(String[] args) {
        PartTimeEmployee hoang = new PartTimeEmployee("Hoang", 18, '0', "Cooker", "2023-01-01", 28);
        System.out.print(hoang.toString());
    }
}