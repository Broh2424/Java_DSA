package dsa.Tree;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Inserting elements into the tree
        tree.insert(50);
        tree.insert(70);
        tree.insert(60);
        tree.insert(20);
        tree.insert(90);
        tree.insert(10);
        tree.insert(40);
        tree.insert(100);

        // Performing in-order traversal
        System.out.println("In-order traversal of the binary tree:");
        tree.inorder();
        tree.preorder();
        tree.postorder();
        tree.postorder1();
    }
}