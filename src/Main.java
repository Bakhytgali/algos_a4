public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(9);
        tree.insert(11);
        tree.insert(32);
        tree.insert(4);
        tree.insert(1);
        tree.search(9, 1);
    }
}