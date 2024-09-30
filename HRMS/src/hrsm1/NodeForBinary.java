package hrsm1;

class TreeNode {
    Employee data;
    TreeNode left, right;

    TreeNode(Employee data) {
        this.data = data;
        left = right = null;
    }
}