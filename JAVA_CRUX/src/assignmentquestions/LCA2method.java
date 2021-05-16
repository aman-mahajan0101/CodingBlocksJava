package assignmentquestions;
import java.util.*;
public class LCA2method {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	LCA2method m = new LCA2method();
        BinaryTree bt = m.new BinaryTree();
        System.out.print(bt.lsa());
        
    }
    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }
        private Node root;
        private int size;
        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }
        public Node takeInput(Node parent, boolean ilc) {
            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;
            // left
            boolean hlc = scn.nextBoolean();
            if (hlc) {
                child.left = this.takeInput(child, true);
            }
            // right
            boolean hrc = scn.nextBoolean();
            if (hrc) {
                child.right = this.takeInput(child, false);
            }
            // return
            return child;
        }
        int minsum = Integer.MAX_VALUE;
        public int lsa() {
        lsa(this.root);
        return minsum;
      }
    private int lsa(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int ls = lsa(node.left);
        int rs = lsa(node.right);
        int sum = node.data;
        if (sum < minsum) {
            minsum = sum;
        }
        return sum;
     }
    }
}
