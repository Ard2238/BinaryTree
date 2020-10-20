public class MyBinaryTreeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Binary Tree Program");

        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

        int size = myBinaryTree.getSize();
        if(size == 3)
            System.out.print(true);
        else
            System.out.print(false);

        myBinaryTree.search(70);
    }
}
