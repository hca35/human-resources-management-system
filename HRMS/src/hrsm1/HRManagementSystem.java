package hrsm1;

import java.util.Scanner;

public class HRManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList employeeList = new LinkedList();
        BinarySearchTree employeeTree = new BinarySearchTree();

        int choice;
        do {
            System.out.println("Human Resource Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
            case 1:
                System.out.print("Enter Employee ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                System.out.print("Enter First Name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter Last Name: ");
                String lastName = scanner.nextLine();
                System.out.print("Enter Birth Day (DD-MM-YYYY): ");
                String birthDay = scanner.nextLine();
                System.out.print("Enter Position: ");
                String position = scanner.nextLine();
                System.out.print("Enter Hire Date: ");
                String hireDate = scanner.nextLine();
                System.out.print("Enter Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();

                Employee employee = new Employee(id, email, firstName, lastName, position, hireDate, salary, birthDay);
                employeeList.insert(employee);
                employeeTree.insert(employee);
                System.out.println("Employee added successfully!");
                break;
                case 2:
                    System.out.println("All Employees:");
                    employeeList.displayAllEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scanner.nextInt();
                    employeeTree.search(searchId);
                    break;
                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    if (employeeList.deleteEmployee(deleteId)) {
                        System.out.println("Employee deleted successfully!");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}