package binarytree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class BinarySearchTreeTests {

    BinarySearchTree bst = new BinarySearchTree();
    Node root = null;

    @Before
    public void setUp() {
        int[] array = new int[]{20, 100, 10, 1, 22, 9, 45};
        for (int i : array) {
            root = bst.insertRec(root, i);
        }
    }

    @Test
    public void inorder_output() {
        bst.inorder(root);
        System.out.println();
    }

    @Test
    public void searchWhenFindout_thenReturnNode() {
        var node = bst.search(root, 100);
        Assert.assertEquals(100, node.key);
    }

    @Test
    public void searchWhenNotExists_thenReturnNull() {
        var node = bst.search(root, 1000);
        assertNull(node);
    }
}
