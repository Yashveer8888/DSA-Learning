package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Tree_Traversal_Methods {
    Node root;

    //1. Depth-First Search (DFS)

    // Preorder Traversal (Root → Left → Right)
    void preorder(Node node) {
        if (node == null) return;
        
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }    

    // Inorder (Left → Root → Right)
    void inorder(Node node) {
        if (node == null) return;
        
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder (Left → Right → Root)
    void postorder(Node node) {
        if (node == null) return;
        
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }


    // 2. Breadth-First Search (BFS)

    // Level-order traversal visits nodes level by level
    void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();  // Removes and returns the front element
            System.out.print(node.data + " ");

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }


    public static void main(String[] args) {
        Tree_Traversal_Methods tree = new Tree_Traversal_Methods();

        // Creating a sample tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Preorder Traversal:");
        tree.preorder(tree.root);
        System.out.print("\ninorder Traversal:");
        tree.inorder(tree.root);
        System.out.print("\npostorder Traversal:");
        tree.postorder(tree.root);
        System.out.print("\nlevelOrder Traversal:");
        tree.levelOrder(tree.root);
    }
}