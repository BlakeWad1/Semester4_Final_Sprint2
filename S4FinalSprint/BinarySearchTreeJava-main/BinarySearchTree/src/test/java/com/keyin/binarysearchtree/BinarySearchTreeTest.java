package com.keyin.binarysearchtree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTreeTest {
    BinarySearchTree tree = new BinarySearchTree();

    @BeforeEach
    void setup() {
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
    }

    @Test
    void testIfRootNode_NotNull() {
        Assertions.assertNotNull(tree.getRoot());
    }

    @Test
    void testRightNodeExists() {
        Assertions.assertEquals(70, tree.root.getRight().value);
    }

    @Test
    void testLeftNodeExists() {
        Assertions.assertEquals(30, tree.root.getLeft().value);
    }
    @Test
    public void deleteTest() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.delete();

        assertEquals(50, tree.root.value);
        assertEquals(30, tree.root.left.value);

        assertTrue(tree.root.left.left == null);

        assertEquals(40, tree.root.left.right.value);
        assertEquals(70, tree.root.right.value);

        tree.root.print();
    }


}
