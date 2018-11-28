// Question 5

class bst {
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(35);
        System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    static boolean isBST(Node root, int min, int max) {
        if (root != null) {
            if (root.data > max || root.data < min) {
                return false;
            }
            // Recursively check whether the left child of current node is less than root
            // and right child of curernt node is more than root
            return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
        } else {
            return true;
        }
    }
}


class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
