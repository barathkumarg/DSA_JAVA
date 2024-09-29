package Tree;

class Node {
    Node left;
    Node right;
    int value;

    Node(int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }
}


public class BinaryTree {

    public static void printTree(Node root) {
        if (root == null) {
            return;
        }

        System.out.println("      " + root.value); // Root node

        // First level
        if (root.left != null || root.right != null) {
            System.out.println("   /      \\");
            System.out.println("  " + (root.left != null ? root.left.value : "null") + "        " + (root.right != null ? root.right.value : "null"));
        }

        // Second level (left and right children of both root.left and root.right)
        if (root.left != null && (root.left.left != null || root.left.right != null) ||
                root.right != null && (root.right.left != null || root.right.right != null)) {
            System.out.println("/   \\     /    \\");
            System.out.println((root.left != null && root.left.left != null ? root.left.left.value : "null") + "   " +
                    (root.left != null && root.left.right != null ? root.left.right.value : "null") + "     " +
                    (root.right != null && root.right.left != null ? root.right.left.value : "null") + "    " +
                    (root.right != null && root.right.right != null ? root.right.right.value : "null"));
        }
    }

    // Inorder Traversal
    public static void inorderTraversal(Node root){
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.value + " ");
        inorderTraversal(root.right);
    }

    // Preorder Traversal
    public static void preorderTraversal(Node root){
        if (root == null) return;
        System.out.print(root.value + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    //Postorder Traversal
    public static void postorderTraversal(Node root){
        if (root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.value + " ");
    }
}
