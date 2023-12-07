package dsa.Tree;

import java.util.Stack;

public class BinaryTree {
    Node root;
    public  BinaryTree(){
        root= null;
    }

    public void insert(int data){
        if(root==null){
            root=new Node(data);
        }
        else {
            Stack<Node> stack= new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()){
                Node current=stack.pop();
                if(data< current.data){
                    if(current.left==null) current.left= new Node(data);
                    else stack.push(current.left);
                } else if (data> current.data) {
                    if(current.right==null) current.right= new Node(data);
                    else  stack.push(current.right);
                }
            }
        }
    }

    public void inorder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = root;

        // Traverse the tree in in-order without recursion
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data + " ");

            current = current.right;
        }

        System.out.println();
    }

    public void preorder(){
        if(root==null){
            System.out.println("tree is empty");
            return;
        }
        Stack<Node> stack= new Stack<>();
        Node current= root;
        System.out.println("pre-order traversel");
        while (current!=null || !stack.isEmpty()){
            while (current!=null){
                System.out.print(current.data+" ");
                stack.push(current);
                current=current.left;
            }
           current= stack.pop();
            current=current.right;
        }
        System.out.println();
    }
    public void postorder(){
        if(root==null){
            System.out.println("tree is empty");
            return;
        }
        Stack<Node>stack= new Stack<>();
        Node current=root;
        Node lastvisted=null;
        System.out.println("post-order traversal");
        while(current!=null||!stack.isEmpty()){
            while (current!=null){
                stack.push(current);
                current=current.left;
            }
            current=stack.peek();
            if(current.right==null|| current.right==lastvisted){

                System.out.print(current.data+" ");
                stack.pop();
                lastvisted=current;
                current=null;
            }else current=current.right;

        }
        System.out.println();
    }
    public void postorder1() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);

        // Traverse the tree in post-order without recursion
        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);

            if (current.left != null) {
                stack1.push(current.left);
            }

            if (current.right != null) {
                stack1.push(current.right);
            }
        }

        // Print the result from the second stack
        System.out.print("Post-order traversal of the binary tree: ");
        while (!stack2.isEmpty()) {
            Node node = stack2.pop();
            System.out.print(node.data + " ");
        }
        System.out.println();
    }
}
