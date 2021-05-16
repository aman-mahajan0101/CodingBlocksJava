package assignmentquestions;

import java.util.*;
public class FindSumAtLevelK{
   static Scanner scn = new Scanner(System.in);
    private class GenricTree {
            private class Node {
            int data;
            ArrayList<Node> Children = new ArrayList<>();
        }
        private Node root;
        public GenricTree() {
            root = construct(null, -1);
        }
        private Node construct(Node parent, int ith) {
            // prompt
            //if (parent == null) {
              //  System.out.println("Enter the data for root node ? ");
           // } else {
                //System.out.println("Enter the data for " + ith + " child of " + parent.data + " ? ");
           // }
            // take input of data
            int item = scn.nextInt();
            // create a new node
            Node nn = new Node();
            // update the data
            nn.data = item;
            // prompt
            //System.out.println("Enter the number of children for " + nn.data + " ? ");
            // take input for children
            int noc = scn.nextInt();
            // loop
            for (int j = 0; j < noc; j++) {
                Node child = construct(nn, j);
                nn.Children.add(child);
            }
            return nn;
        }
        int sum=0;
        public void KLevelSum(int level)
        {
            System.out.println(KLevelSum(root,level,0));
        }
        private int KLevelSum(Node node,int level,int check)
        {
            
            if(check==level)
            {
                sum+=node.data;
            
            }
            for(Node child:node.Children)
            {
                KLevelSum(child,level,check+1);
            }
            return sum;
        }
    }
 
  
  public static void main(String[] args) {
        FindSumAtLevelK m =new FindSumAtLevelK();
        GenricTree gt =m.new GenricTree();
        
        //Scanner scn =new Scanner (System.in);
        int level=scn.nextInt();
        gt.KLevelSum(level);
        
    }
}

