package assignmentquestions;

import java.util.*;
import java.util.Scanner;
public class RootToLeaf {
    static Scanner scn = new Scanner(System.in);
    public static void main(String args[]) {
        RootToLeaf m=new RootToLeaf();
            BinaryTree bt = m.new BinaryTree();
            int k=scn.nextInt();
        bt.roottoleaf(k);
    }
    private class BinaryTree {
    Scanner scn = new Scanner(System.in);
    private class Node {
        int data;
        Node left;
        Node right;
    }
    private Node root;
    public BinaryTree() {
        root = takeinput(null, false);
    }
    private Node takeinput(Node parent, boolean ilc) {
        // enter data of the node you have entered
        if (parent == null) {
        //  System.out.println("enter data of root node ?");
        } else {
            if (ilc) {
        //      System.out.println("enter data for left child of " + parent.data);
            } else {
        //      System.out.println("enter data for right child of " + parent.data);
            }
        }
        int item = scn.nextInt();
        // create new node
        Node nn = new Node();
        nn.data = item;
        // ask does node have left child
        //System.out.println(nn.data + " has left child ?");
        // take input for the same
        boolean hlc = scn.nextBoolean();
        // if yes take input for left child
        if (hlc) {
            nn.left = takeinput(nn, true);
        }
        // ask does node have left child
        //System.out.println(nn.data + " has right child ?");
        // take input for the same
        boolean hrc = scn.nextBoolean();
        // if yes take input for right child
        if (hrc) {
            nn.right = takeinput(nn, false);
        }
        return nn;
    }
    public void roottoleaf(int k) {
        roottoleaf(root,0,"",k);
    }
    private void roottoleaf(Node node, int sum, String ans, int k) {
        if(node==null) {
            return;
        }
        if(sum+node.data==k&&node.left==null&&node.right==null) {
            System.out.println(ans+" "+node.data);
            return;
        }
    roottoleaf(node.left, sum + node.data, ans + node.data+ " ", k);
            roottoleaf(node.right, sum + node.data, ans + node.data + " ", k);
        
    }
    }
}