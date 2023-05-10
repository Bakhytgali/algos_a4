public class BinaryTree {
    public class Node {
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    Node root;
    public BinaryTree(){
        root = null;
    }

    public int search(int data){
        Node current;
        boolean contains = false;
        if(current == null) {
            contains = false;
        }
        if(data != current.data){
            if(data > current.data){
                return search(current.right, data);
            }
            if(data < current.data){
                return search(current.left, data);
            }
        }
        if(data == current.data){
            contains = true;
        }
        if(contains == true){
            return 1;
        } else {
            return 0;
        }
    }
    private Node insert(Node current, int data){
        if(current == null){
            return new Node(data);
        }
        if(data < current.data){
            current.left = insert(current.left, data);
        } else if (data > current.data) {
            current.right = insert(current.right, data);
        }
        return current;
    }
    public void insert(int data){
        root = insert(root, data);
    }

}
