package hrsm1;

class BinarySearchTree {
    TreeNode root;

    void insert(Employee employee) {
        root = insertRec(root, employee);
    }

    TreeNode insertRec(TreeNode node, Employee employee) {
        if (node == null) {
            return new TreeNode(employee);
        }
        if (employee.getEmployeeId() < node.data.getEmployeeId()) {
            node.left = insertRec(node.left, employee);
        } else if (employee.getEmployeeId() > node.data.getEmployeeId()) {
            node.right = insertRec(node.right, employee);
        }
        return node;
    }

    void search(int id) {
        TreeNode result = searchRec(root, id);
        if (result == null) {
            System.out.println("Employee not found.");
        } else {
            result.data.displayDetails();
        }
    }

    TreeNode searchRec(TreeNode node, int id) {
        if (node == null || node.data.getEmployeeId() == id) {
            return node;
        }
        if (id < node.data.getEmployeeId()) {
            return searchRec(node.left, id);
        } else {
            return searchRec(node.right, id);
        }
    }
}