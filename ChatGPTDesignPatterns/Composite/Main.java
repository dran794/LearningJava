package Composite;

import java.util.ArrayList;
import java.util.List;

// Component interface
interface Employee {
  void displayDetails();
}

// Leaf class
class IndividualEmployee implements Employee {
  private String name;
  private String position;

  public IndividualEmployee(String name, String position) {
    this.name = name;
    this.position = position;
  }

  @Override
  public void displayDetails() {
    System.out.println("Employee: " + name + ", Position: " + position);
  }
}

// Composite class
class Department implements Employee {
  private String name;
  private List<Employee> employees = new ArrayList<>();

  public Department(String name) {
    this.name = name;
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public void removeEmployee(Employee employee) {
    employees.remove(employee);
  }

  @Override
  public void displayDetails() {
    System.out.println("Department: " + name);
    System.out.println("Employees:");

    for (Employee employee : employees) {
      employee.displayDetails();
    }
  }
}

// Client code
public class Main {
  public static void main(String[] args) {
    // Creating individual employees
    Employee john = new IndividualEmployee("John Smith", "Manager");
    Employee sarah = new IndividualEmployee("Sarah Johnson", "Assistant Manager");
    Employee mike = new IndividualEmployee("Mike Davis", "Sales Representative");

    // Creating departments
    Department sales = new Department("Sales");
    Department retailSales = new Department("Retail Sales");

    // Adding employees to departments
    sales.addEmployee(john);
    sales.addEmployee(sarah);
    retailSales.addEmployee(mike);

    // Adding sub-departments to departments
    sales.addEmployee(retailSales);

    // Displaying department details
    sales.displayDetails();
  }
}
