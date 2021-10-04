package com.sparta.sorting.model;

public class BinaryTree {
    private Node root = null;

    public Node addRec(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value <= current.value) {
            current.left = addRec(current.left, value);
        } else if (value > current.value) {
            current.right = addRec(current.right, value);
        }
        return current;
    }

    public void add(int value) {
        root = addRec(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.value);
            System.out.println(node.value);
            traverseInOrder(node.right);
        }
    }


    public int extractValues(Node n, int[] arr, int index) {
        if (n.getLeft() != null) {
            index = extractValues(n.getLeft(), arr, index);
        }
        if (n.getRight() != null) {
            index = extractValues(n.getRight(), arr, index);
        }
        arr[index] = n.getValue();
        return index+1;
    }

    public Node getRoot(){
        return root;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }

    private class Node {
        private int value;
        private com.sparta.sorting.model.BinaryTree.Node left;
        private com.sparta.sorting.model.BinaryTree.Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public com.sparta.sorting.model.BinaryTree.Node getLeft() {
            return left;
        }

        public void setLeftNode(com.sparta.sorting.model.BinaryTree.Node left) {
            this.left = left;
        }

        public com.sparta.sorting.model.BinaryTree.Node getRight() {
            return right;
        }

        public void setRightNode(com.sparta.sorting.model.BinaryTree.Node right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
