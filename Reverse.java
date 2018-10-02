import java.util.*;
public class Link
{
    Node head;
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
        public Node add(int d)
        {
            if(head==null)
            {
            Node n=new Node(d);
            head=n;
            return n;
            }
            else
            {
                  Node n=new Node(d);
                  Node t=head;
                  while(t.next!=null)
                  {
                      t=t.next;
                  }
                  t.next=n;
                  return head;
            }
        }
       public  Node reverse()
        {
            Node c=head;
            Node prev=null;
            Node nxt=null;
            while(c!=null)
            {
                nxt=c.next;
                c.next=prev;
                prev=c;
                c=nxt;
            }
            head=prev;
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
        public static void main(String a[])
        {
            Link l=new Link();
            Scanner s=new Scanner(System.in);
            int num=s.nextInt();
            for(int i=0;i<num;i++)
            {
                int d=s.nextInt();
                l.add(d);
            }
            l.reverse();
            l.display();
        }
}