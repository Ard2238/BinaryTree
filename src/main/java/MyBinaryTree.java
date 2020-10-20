public class MyBinaryTree<K extends Comparable<K>> {
    MyBinaryNode<K> root;

    public void add(MyBinaryNode root, K key){
        if(root == null) {
            root = new MyBinaryNode(key);
            return;
        }
        int result = key.compareTo((K) root.key);
        if(result == 0)
            return;
        else if(result < 0)
            add(root.left, key);
        else
            add(root.right, key);

        return;
    }
}
