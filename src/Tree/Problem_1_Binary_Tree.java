package Tree;

public class Problem_1_Binary_Tree {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        BinaryTree.printTree(root);

        //Inorder Traversal
        System.out.println("Inorder Traversal:");
        BinaryTree.inorderTraversal(root);
        System.out.println();

        //Preorder Traversal
        System.out.println("Preorder Traversal:");
        BinaryTree.preorderTraversal(root);
        System.out.println();

        //Postorder Traversal
        System.out.println("Postorder Traversal:");
        BinaryTree.postorderTraversal(root);
        System.out.println();


    }
}
