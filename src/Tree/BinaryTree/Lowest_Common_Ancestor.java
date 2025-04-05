package Tree.BinaryTree;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Lowest_Common_Ancestor {
    Node root;

    // Function to find LCA of two given nodes in a Binary Tree
    Node LCA(Node root, int n1, int n2) {
        if (root == null) return null;
        if (root.data == n1 || root.data == n2) return root;

        Node leftLCA = LCA(root.left, n1, n2);
        Node rightLCA = LCA(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) return root;
        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    public static void main(String[] args) {
        Lowest_Common_Ancestor tree = new Lowest_Common_Ancestor();

        // Creating a sample tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Finding LCA of two nodes
        int n1 = 4, n2 = 5;
        Node lca = tree.LCA(tree.root, n1, n2);

        System.out.print("LCA of " + n1 + " and " + n2 + " is: ");
        System.out.println(lca != null ? lca.data : "LCA not found");
    }
}
