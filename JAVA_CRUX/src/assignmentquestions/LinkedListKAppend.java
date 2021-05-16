package assignmentquestions;

import java.util.Scanner;
public class LinkedListKAppend {
    public class node {
        int data;
        node next;
    }
    private node head;
    private node tail;
    private int size;
    public void addlast(int item) {
        node nn = new node();
        nn.data = item;
        nn.next = null;
        if (size >= 1) {
            this.tail.next = nn;
        }
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            this.size++;
        }
    }
    private node getnodeat(int idx) throws Exception {
        if (idx > size)
            throw new Exception("node doesnt exist");
        int i = 1;
        node temp = this.head;
        while (i <= idx) {
            temp = temp.next;
            i++;
        }
        return temp;
    }
    public void addfirst(int item) {
        node nn = new node();
        nn.data = item;
        nn.next = null;
        if (size >= 1) {
            nn.next = head;
        }
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size = 1;
        } else {
            this.head = nn;
            this.size++;
        }
    }
    public int removeat(int idx) throws Exception {
        if (size == 0) {
            throw new Exception("LL is Empty");
        }
        node nn = getnodeat(idx);
        int rr = nn.data;
        if (size == 1) {
            head = null;
            tail = null;
            this.size--;
        } else {
            node nn1 = getnodeat(idx - 1);
            node nn2 = getnodeat(idx + 1);
            nn1.next = nn2;
            this.size--;
        }
        return rr;
    }
    public void addat(int item, int idx) throws Exception {
        if (idx > size) {
            throw new Exception("node doesnt exist");
        }
        node nn = new node();
        nn.data = item;
        nn.next = null;
        if (idx == 0) {
            addfirst(item);
        } else if (idx == size) {
            addlast(item);
        }
        else {
            node nm1 = getnodeat(idx - 1);
            node np1 = nm1.next;
            nm1.next = nn;
            nn.next = np1;
            this.size++;
        }
    }
    public void append(int k,int n) throws Exception {
        if(head==null) {
            return;
        }
        tail.next=head;
        node tmp=head;
        int num;
        num=n-k%n;
        while(num>1)
        {
            tmp=tmp.next;
            num--;
        }
        head=tmp.next;
        tmp.next=null;
        tail=tmp;
    }
    public void display() {
        node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = n;
        LinkedListKAppend obj = new LinkedListKAppend();
        while (num > 0) {
            int item = scn.nextInt();
            obj.addlast(item);
            num--;
        }
        int k = scn.nextInt();
        obj.append(k,n);
        obj.display();
    }
}
