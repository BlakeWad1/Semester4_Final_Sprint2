package com.keyin.binarysearchtree;

class BinarySearchTree {
    class Node {
        int value;
        Node left, right;
        public Node(int data)
        {
            value = data;
            left = right = null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }
        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
        public void print() {
            System.out.println(this);
        }
    }
    Node root;

    BinarySearchTree() {
        root = null;
    }

    BinarySearchTree(int value) {
        root = new Node(value);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    int minValue(Node root) {
        int minvalue = root.value;
        while (root.left != null) {
            minvalue = root.left.value;
            root = root.left;
        }

        return minvalue;
    }

    void insert(int value) {
        root = insertRecur(root, value); }

    Node insertRecur(Node root, int value)
    {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value)
            root.left = insertRecur(root.left, value);

        else if (value > root.value)
            root.right = insertRecur(root.right, value);

        return root;
    }

    void inorder() {
        inorderRecur(root);
    }

    void inorderRecur(Node root)
    {
        if (root != null) {
            inorderRecur(root.left);
            System.out.println(root.value);
            inorderRecur(root.right);
        }
    }

    void delete() {
        root = delete_recursive(root, 20);
    }

    Node delete_recursive(Node root, int value) {
        if (root == null) {
            return root;
        }
        if (value < root.value) {
            root.left = delete_recursive(root.left, value);

        } else if (value > root.value) {
            root.right = delete_recursive(root.right, value);

        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.value = minValue(root.right);

            root.right = delete_recursive(root.right, root.value);
        }
        return root;
    }

}