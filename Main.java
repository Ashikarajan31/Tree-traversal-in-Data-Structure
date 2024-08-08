import java.util.*;
// Define the TreeNode class
class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

// Define the TreeTraversal class
class TreeTraversal {
    public void preorder(TreeNode node) {
        if (node == null)
            return;
            System.out.print(node.value + " ");
        inorder(node.left);
        
        inorder(node.right);
    }


public void inorder(TreeNode node) {
    if (node == null)
        return;
    
    inorder(node.left);
    System.out.print(node.value + " ");
    inorder(node.right);
}

public void postorder(TreeNode node) {
    if (node == null)
        return;
    
    inorder(node.left);
    inorder(node.right);
    System.out.print(node.value + " ");
}
}

// Define the Main class with the main method
public class Main {
    public static void main(String[] args) {
        // Create the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.left.right.left=new TreeNode(8);
        root.right.right.left=new TreeNode(9);
        root.right.right.right=new TreeNode(10);

        // Create an instance of TreeTraversal and perform preorder traversal
        TreeTraversal tree = new TreeTraversal();
        System.out.println("\npreorder Traversal: ");
        tree.preorder(root);

        System.out.println("\ninorder Traversal:");
        tree.inorder(root);

        System.out.println("\npostorder Traversal");
        tree.postorder(root);
    }
}
