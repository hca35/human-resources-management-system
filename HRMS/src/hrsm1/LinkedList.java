package hrsm1;

class LinkedList {
    Node head;

    void insert(Employee employee) {
        Node newNode = new Node(employee);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    boolean deleteEmployee(int id) {
        if (head == null) {
            System.out.println("No employees found.");
            return false;
        }

        if (head.data.getEmployeeId() == id) {
            head = head.next;
            return true;
        }

        Node prev = null;
        Node curr = head;
        while (curr != null && curr.data.getEmployeeId() != id) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            return false;
        } else {
            prev.next = curr.next;
            return true;
        }
    }

    void displayAllEmployees() {
        if (head == null) {
            System.out.println("No employees found.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            temp.data.displayDetails();
            temp = temp.next;
        }
    }
}