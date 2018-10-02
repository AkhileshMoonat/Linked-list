import java.util.*;
public class Nodes
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
    Node arrange()
    {
        Node t=head;
        Node ehead=null;
        Node etail=null;
        Node ohead=null;
        Node otail=null;
        while(t!=null)
        {
            if(t.data%2==0)
            {
                if(ehead==null)
                {
                ehead=etail=t;
                }
                else
                {
                   etail.next=t;
                   etail=t;
                }
             }
        else
        {
            if(ohead==null)
            {
                ohead=otail=t;
            }
            else
            {
                otail.next=t;
                otail=t;
            }
        }
        t=t.next;
    }
    otail.next=ehead;
    etail.next=null;
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
        Nodes m=new Nodes();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int d1=s.nextInt();
            m.add(d1);
        }
        m.arrange();
        m.display();
    }
}