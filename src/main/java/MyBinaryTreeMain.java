public class MyBinaryTreeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Binary Tree Program");

        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(myBinaryTree.root, 56);
        myBinaryTree.add(myBinaryTree.root, 30);
        myBinaryTree.add(myBinaryTree.root, 70);
    }
}
