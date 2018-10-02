import java.util.*;
public class Merge
{
    Node head;
    Node head2;
    class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node add1(int d1)
    {
        Node n1=new Node(d1);
        if(head==null)
        {
            head=n1;
            return n1;
        }
        else
        {
            Node t=head;
            while(t.next!=null)
            {
                t=t.next;
            }
            t.next=n1;
            return head;
        }
    }
     Node add2(int d2)
    {
        Node n2=new Node(d2);
        if(head2==null)
        {
            head2=n2;
            return n2;
        }
        else
        {
            Node t=head2;
            while(t.next!=null)
            {
                t=t.next;
            }
            t.next=n2;
            return head2;
        }
    }
    Node merge()
    {
        Node tmp=head;
        while(tmp.next!=null)
        {
            tmp=tmp.next;
        }
        tmp.next=head2;
        Node t2=head;
        Node p=t2;
        while(t2.next!=null)
        {
            p=t2;
            while(p!=null)
            {
                if(t2.data>p.data)
                {
                    int temp=t2.data;
                    t2.data=p.data;
                    p.data=temp;
                    p=p.next;
                }
                p=p.next;
            }
            t2=t2.next;
        }
        return head;
    }
    public void display()
    {
        Node t=head;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
    public static void main(String args[])
    {
        Merge m=new Merge();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n2=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int d1=s.nextInt();
            m.add1(d1);
        }
         for(int i=0;i<n2;i++)
        {
            int d2=s.nextInt();
            m.add2(d2);
        }
        m.merge();
        m.display();
    }
}