package Tree.BinaryTree;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Operations_on_Trees {
    Node root;

    // 1. Insertion in a BST
    Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // 2. Deletion in a BST
    Node deleteNode(Node root, int key) {
        if (root == null) return root;

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node with one child or no child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            Node minNode = findMin(root.right);
            root.data = minNode.data;

            // Delete the inorder successor
            root.right = deleteNode(root.right, minNode.data);
        }
        return root;
    }

    Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // 3. Searching in a BST
    Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }

        if (key < root.data) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    // 4. Finding Height of a Tree
    int height(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    // 5. Inorder Traversal (for Testing)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Operations_on_Trees tree = new Operations_on_Trees();

        // Inserting nodes into BST
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("Inorder Traversal after Insertion:");
        tree.inorder(tree.root);

        // Searching for a value
        int key = 40;
        Node result = tree.search(tree.root, key);
        System.out.println("\nSearch for " + key + ": " + (result != null ? "Found" : "Not Found"));

        // Finding height of the tree
        System.out.println("Height of the Tree: " + tree.height(tree.root));

        // Deleting a node
        int deleteKey = 50;
        tree.root = tree.deleteNode(tree.root, deleteKey);
        System.out.println("Inorder Traversal after Deleting " + deleteKey + ":");
        tree.inorder(tree.root);
    }
}
