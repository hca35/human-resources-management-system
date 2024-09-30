package hrsm1;



class Employee {
    private int employeeId;
    private String email;
    private String firstName;
    private String lastName;
    private String position;
    private String hireDate;
    private double salary;
    private String birthDay;

    Employee(int employeeId, String email, String firstName, String lastName, String position, String hireDate, double salary, String birthDay) {
        this.employeeId = employeeId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.hireDate = hireDate;
        this.salary = salary;
        this.birthDay = birthDay;
    }

    int getEmployeeId() {
        return employeeId;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Email: " + email);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Day: " + birthDay);
        System.out.println("Position: " + position);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

