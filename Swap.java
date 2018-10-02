import java.util.*;
public class Interchange
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
    Node add(int d1)
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
    Node swap(int a,int b)
    {
        Node x1=head;
        Node p1=null;
        Node x2=head;
        Node p2=null;
        while(x1!=null && x1.data!=a)
        {
            p1=x1;
            x1=x1.next;
        }
          while(x2!=null && x2.data!=b)
        {
            p2=x2;
            x2=x2.next;
        }
       if(p1!=null)
       {
           p1.next=x2;
       }
       else 
       {
           head=x2;
       }
       if(p2!=null)
       {
           p2.next=x1;
       }
       else 
       {
           head=x1;
       }
       Node temp=x1.next;
       x1.next=x2.next;
       x2.next=temp;
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
        Interchange m=new Interchange();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int d1=s.nextInt();
            m.add(d1);
        }
        int a=s.nextInt();
        int b=s.nextInt();
        m.swap(a,b);
        m.display();
    }
}