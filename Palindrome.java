import java.util.*;
public class Palindrome
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
        Node n=new Node(d);
        if(head==null)
        {
            head=n;
        }
        else
        {
            Node t=head;
            while(t.next!=null)
            {
                t=t.next;
            }
            t.next=n;
        }
        return head;
    }
    public boolean check()
    {
        Node f=head;
        Node s=head;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        Node half=s.next;
        s.next=null;
        Node c1=half;
        Node c2=c1.next;
        while(c1!=null && c2!=null)
        {
           Node tmp=c2.next;
            c2.next=c1;
            c1=c2;
            c2=tmp;  
        }
        half.next=null;
        Node p=(c2==null?c1:c2);
        Node q=head;
          while(p!=null){
        if(p.data != q.data)
            return false;
        p = p.next;
        q = q.next;
    }
    return true;
    }
    public static void main(String args[])
    {
        Palindrome o=new Palindrome();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int d=s.nextInt();
            o.add(d);
        }
        if(o.check()==true)
        {
            System.out.print("Entered Linked List is a Palindrome");
        }
        else
        {
            System.out.print("Entered Linked List is not a Palindrome");
        }
    }
}