public class MyBinaryTree<K extends Comparable<K>> {
    MyBinaryNode<K> root;
    public void add(K key){
        this.root = addRecursively(root, key);
    }
    public MyBinaryNode<K> addRecursively(MyBinaryNode root, K key){
        if(root == null) {
            return new MyBinaryNode<>(key);
        }
        int result = key.compareTo((K) root.key);
        if(result == 0)
            return root;
        else if(result < 0)
            root.left = addRecursively(root.left, key);
        else
            root.right = addRecursively(root.right, key);
        return root;
    }

    public int getSize(){
        return this.getSizeRecursively(this.root);
    }

    public int getSizeRecursively(MyBinaryNode root){
        return this.root == null ? 0 : 1 + this.getSizeRecursively(root.left) + this.getSizeRecursively(root.right);
    }
    public void search(K key){
        searchRecursively(this.root, key);
    }
    public void searchRecursively(MyBinaryNode current, K key){
        if(current == null)
            return;
        if(current.key == key)
            System.out.println("Node Exists");
        else if( current.key.compareTo(key) > 0)
            searchRecursively(current.right, key);
        else
            searchRecursively(current.left, key);
    }

}
