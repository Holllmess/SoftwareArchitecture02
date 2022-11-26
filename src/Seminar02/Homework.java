package Seminar02;

import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        Worker worker01 = new Worker("Sherlock", "Holmes", 5000);
        System.out.println(worker01);

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateNonSpecificEmployees();
        }

        for (Employee employee:employees) {
            System.out.println(employee);
        }
    }

    static Employee generateConcreteEmployee(EmployeeType type){
        String[] names = {"Sherlock", "John", "Greg", "Molly", "Marry", "Mycroft", "Iren", "Enola", "Jim"};
        String[] surnames = {"Holmes", "Watson", "Lestrade", "Morstan", "Hooper", "Anderson", "Hudson", "Adler", "Moriarty"};
        Random random = new Random();
        int indexName = random.nextInt(names.length);
        int indexSurname = random.nextInt(surnames.length);
        double workerValue = 2500 + Math.random() * 4300;
        double freelancerValue = 35 + Math.random() * 90;
        return switch (type) {
            case Worker -> new Worker(names[indexName], surnames[indexSurname], workerValue);
            case Freelancer -> new Freelancer(names[indexName], surnames[indexSurname], freelancerValue);
        };
    }

    static Employee generateNonSpecificEmployees(){
        String[] names = {"Sherlock", "John", "Greg", "Molly", "Marry", "Mycroft", "Iren", "Enola", "Jim"};
        String[] surnames = {"Holmes", "Watson", "Lestrade", "Morstan", "Hooper", "Anderson", "Hudson", "Adler", "Moriarty"};
        Random random = new Random();
        int indexName = random.nextInt(names.length);
        int indexSurname = random.nextInt(surnames.length);
        double workerValue = 2500 + Math.random() * 4300;
        double freelancerValue = 35 + Math.random() * 70;

        EmployeeType type;
        double fatefulIndex = Math.random() * 2;
        if (fatefulIndex < 1) {
            type = EmployeeType.Worker;
        } else {
            type = EmployeeType.Freelancer;
        }
        return switch (type) {
            case Worker -> new Worker(names[indexName], surnames[indexSurname], workerValue);
            case Freelancer -> new Freelancer(names[indexName], surnames[indexSurname], freelancerValue);
        };
    }
}
