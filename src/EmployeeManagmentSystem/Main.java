package EmployeeManagmentSystem;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Software Engineer", 100000.0);
        employee.printEmployeeDetails(); // Print various details about the employee

        Employee employee1 = new Employee("Jane Doe", "Software Engineer", 100000.0);
        employee1.setJobTitle("Senior Software Engineer");
        employee1.setSalary(120000.0);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Job Title: " + employee1.getJobTitle());
        System.out.println("Salary: " + employee1.getSalary());
        employee1.raiseSalary(50); // Raises the salary by 50%
        System.out.println("Salary: " + employee1.getSalary());
    }
}
