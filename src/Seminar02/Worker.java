package Seminar02;

public class Worker extends Employee{

    public Worker(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s: worker, average monthly salary (fixed rate) = $ %.2f",
                name, surname, salary);
    }
}
