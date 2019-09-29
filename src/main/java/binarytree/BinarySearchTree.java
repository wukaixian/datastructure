package binarytree;

public class BinarySearchTree {

    /**
     *         10
     *        / \
     *       8  20
     *      / \
     *     6   9
     * @param root
     * @param value
     * @return
     */
    public Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.key > value) {
            root.left = insertRec(root.left, value);
        }
        if (root.key < value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    /**
     * search by key
     *
     * @param root binary search tree root node
     * @param key  search node key
     * @return search node of equal key
     */
    public Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (root.key > key) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }

    public void inorder(Node root) {
        if (root.left != null) {
            inorder(root.left);
        }

        System.out.print(root.key + "\t");

        if (root.right != null) {
            inorder(root.right);
        }
    }
}
