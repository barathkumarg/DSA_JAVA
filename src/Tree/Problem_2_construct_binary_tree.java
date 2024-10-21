package Tree;


import java.util.LinkedList;
import java.util.Queue;

class createBinaryTree{
    Node root;
    Queue<Node> queue;

    createBinaryTree(){
        queue = new LinkedList<>();
    }

    //method to insert the elements
    public void insertElement(int element){

        //if the queue is empty
        if (queue.isEmpty()){
            root = new Node(element);
            queue.add(root);
        }

        //if not empty
        else if(!queue.isEmpty()){
            Node node = queue.peek();
            if (node.left==null){
                Node lnode = new Node(element);
                node.left = lnode;
                queue.add(lnode);
                System.out.println(element);
            }
            else {
                Node rnode = new Node(element);
                node.right= rnode;
                queue.poll(); //delete the element
                queue.add(rnode);
            }
        }
    }
}

public class Problem_2_construct_binary_tree {

    public static void main(String[] args) {
        createBinaryTree binaryTree = new createBinaryTree();
        binaryTree.insertElement(1);
        binaryTree.insertElement(2);
        binaryTree.insertElement(3);
        binaryTree.insertElement(4);
        binaryTree.insertElement(5);
        BinaryTree.printTree(binaryTree.root);

    }
}
