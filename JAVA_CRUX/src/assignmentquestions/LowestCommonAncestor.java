package assignmentquestions;

import java.util.*;
public class LowestCommonAncestor {
	   static Scanner scn = new Scanner(System.in);
	    public static void main(String[] args) {
	    	LowestCommonAncestor m = new LowestCommonAncestor();
	        BinaryTree bt = m.new BinaryTree();
	        int n1= scn.nextInt();
	        int n2= scn.nextInt();
	        bt.lca(n1, n2);
	       //   bt.display();
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
	               public void display() {
	            this.display(this.root);
	        }
	        private void display(Node node) {
	            if (node == null) {
	                return;
	            }
	            String str = "";
	            if (node.left != null) {
	                str += node.left.data;
	            } else {
	                str += "END";
	            }
	            str += " => " + node.data + " <= ";
	            if (node.right != null) {
	                str += node.right.data;
	            } else {
	                str += "END";
	            }
	            System.out.println(str);
	            this.display(node.left);
	            this.display(node.right);
	        }
	              public void lca(int n1, int n2) {
	                   Node t = lca(root, n1, n2);
	                   System.out.println(t.data);
	                }
	     
	              private Node lca(Node node, int n1, int n2) {
	                    if (node == null)
	                        return null;
	                    if (node.data > n1 && node.data > n2)
	                            node.left = lca(node.left, n1, n2);
	        
	                    if (node.data < n1 && node.data < n2)
	                      node.right = lca(node.right, n1, n2);
	                      return node;
	                }
	        
	    }
	}

