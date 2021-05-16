package assignmentquestions;

import java.util.*;
public class Print_till_k {
    static Scanner s = new Scanner(System.in);
    private class BST {
        private class Node {
            int data;
            Node left;
            Node right;
            public Node(int data, Node left, Node right) {
                this.data = data;
                this.left = left;
                this.right = right;
            }
        }
        private Node root;
        private int size;
        public BST() {
            this.root = null;
            this.size = 0;
        }
        public int size() {
            return this.size;
        }
        public boolean isEmpty() {
            return this.size() == 0;
        }
        public void add(int data) {
            this.add(data, this.root);
        }
        private void add(int data, Node node) {
            if (this.isEmpty()) {
                Node n = new Node(data, null, null);
                this.size++;
                this.root = n;
                return;
            } else {
                if (data > node.data && node.right == null) {
                    Node n = new Node(data, null, null);
                    this.size++;
                    node.right = n;
                } else if (data < node.data && node.left == null) {
                    Node n = new Node(data, null, null);
                    this.size++;
                    node.left = n;
                } else if (data > node.data) {
                    add(data, node.right);
                } else if (data < node.data) {
                    add(data, node.left);
                }
            }
        }
        public boolean find(Node node, int item) {
            if (node == null) {
                return false;
            }
            if (node.data == item) {
                return true;
            }
            boolean lf = find(node.left, item);
            boolean rf = find(node.right, item);
            return lf || rf;
        }
        public int height() {
            return height(root);
        }
        private int height(Node node) {
            if (node == null) {
                return -1;
            }
            int lh = height(node.left);
            int rh = height(node.right);
            return Math.max(lh, rh) + 1;
        }
        public void display() {
            this.display(this.root);
        }
        private void display(Node node) {
            if (node.left != null) {
                System.out.print(node.left.data + " => ");
            } else {
                System.out.print("END => ");
            }
            System.out.print(node.data);
            if (node.right != null) {
                System.out.print(" <= " + node.right.data);
            } else {
                System.out.print(" <= END");
            }
            System.out.println();
            if (node.left != null) {
                display(node.left);
            }
            if (node.right != null) {
                display(node.right);
            }
        }
        public void printKFar(int tar, int k) {
            Nodelevel(this.root, tar, 0);
            boolean left = find(this.root.left, tar);
            int kfar = levelNode - k;
            int kdown = levelNode + k;
            if (this.root.data == tar) {
                this.printKDown(this.root, 0, kdown);
            } else {
            	 int h = this.height();
                 if (kdown <= h && left) {
                     Node temp = this.root.right;
                     this.root.right = null;
                     this.printKDown(this.root, 0, kdown);
                     this.root.right = temp;
                 } else if (kdown <= h && !left) {
                     Node temp = this.root.left;
                     this.root.left = null;
                     this.printKDown(this.root, 0, kdown);
                     this.root.left = temp;
                 }
                if (kfar >= 0 && left) {
                    Node temp = this.root.right;
                    this.root.right = null;
                    this.printKFar(this.root, 0, kfar);
                    this.root.right = temp;
                } else if (kfar >= 0 && !left) {
                    Node temp = this.root.left;
                    this.root.left = null;
                    this.printKFar(this.root, 0, kfar);
                    this.root.left = temp;
                }
               
                if (!left) {
                    Node temp = this.root.right;
                    this.root.right = null;
                    if (this.root.left != null) {
                        PrintOtherSide(this.root.left, 0, k - levelNode-1);
                    }
                    this.root.right = temp;
                } else {
                    Node temp = this.root.left;
                    this.root.left = null;
                    if (this.root.right != null) {
                        PrintOtherSide(this.root.right, 0, k - levelNode-1);
                    }
                    this.root.left = temp;
                }
            }
        }
        int levelNode = 0;
        private int Nodelevel(Node node, int tar, int level) {
            if (node == null) {
                return 0;
            }
            if (node.data == tar) {
                levelNode = level;
                return level;
            }
            Nodelevel(node.left, tar, level + 1);
            Nodelevel(node.right, tar, level + 1);
            return level;
        }
        private void printKFar(Node node, int nl, int pl) {
            // Your Code Goes Here
            if (node == null) {
                return;
            }
            if (nl == pl) {
                System.out.println(node.data);
            }
            printKFar(node.left, nl + 1, pl);
            printKFar(node.right, nl + 1, pl);
        }
        private void printKDown(Node node, int nl, int pl) {
            // Your Code Goes Here
            if (node == null) {
                return;
            }
            if (nl == pl) {
                System.out.println(node.data);
            }
            printKDown(node.left, nl + 1, pl);
            printKDown(node.right, nl + 1, pl);
        }
        public void PrintOtherSide(Node node, int nl, int pl) {
            if (node == null) {
                return;
            }
            if (nl == pl) {
                System.out.println(node.data);
            }
            PrintOtherSide(node.left, nl + 1, pl);
            PrintOtherSide(node.right, nl + 1, pl);
        }
    }
    public static void main(String[] args) {
        Print_till_k m = new Print_till_k();
        BST bst = m.new BST();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            bst.add(s.nextInt());
        }
        int tar = s.nextInt();
        int k = s.nextInt();
       // bst.display();
        bst.printKFar(tar, k);
    }
}