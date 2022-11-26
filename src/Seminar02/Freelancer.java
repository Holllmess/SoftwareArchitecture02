package Seminar02;

public class Freelancer extends Employee{

    public Freelancer(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return (18 * 5) * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s: freelancer, average monthly salary = $ %.2f, hourly rate = $ %.2f",
                name, surname, calculateSalary(), salary);
    }
}
