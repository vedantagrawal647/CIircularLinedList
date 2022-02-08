class CircularDoubllyLinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node previous;

        Node(int data)
        {
            this.data=data;
        }
    }

    public void insertatLast(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
            head.next=head;
            head.previous=head;
        }

        else
        {
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;

            }
            newnode.previous=temp;
            temp.next=newnode;
            newnode.next=head;
            head.previous=newnode;
        }
    }

    public void insertatbegning(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
            head.next=newnode;
            head.previous=newnode;
        }
        else
        {
            Node temp=head;
            newnode.next=head;
            newnode.previous=head.previous;
            temp.previous=newnode;
            head=newnode;
            head.previous.next=head;
        }
    }

    public void  deletefromlast()
    {
        if(head==null)
        {
            System.out.println("empty list");
        }
        else
        {
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.previous.next=head;
            head.previous=temp.previous;
        }
    }

    public void deletefrombegning()
    {
        if(head==null)
        {
            System.out.println("empty list");
        }
        else if(head.next==head)
        {
            head=null;
        }
        else
        {
           Node temp=head;
           head=temp.next;
           head.previous=temp.previous;
           head.previous.next=head;

        }
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("empty list");
        }
        else
        {
            Node temp=head;
            while(temp.next!=head)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        CircularDoubllyLinkedList obj=new CircularDoubllyLinkedList();

        obj.insertatLast(new CircularDoubllyLinkedList.Node(10));

        obj.insertatLast(new CircularDoubllyLinkedList.Node(20));
        obj.insertatLast(new CircularDoubllyLinkedList.Node(30));
        obj.insertatLast(new CircularDoubllyLinkedList.Node(40));
        obj.insertatLast(new CircularDoubllyLinkedList.Node(50));
        obj.display();
        System.out.println("------------");



        obj.insertatbegning(new CircularDoubllyLinkedList.Node(60));
        obj.display();
        System.out.println("------------");

        obj.deletefromlast();
        obj.display();
        System.out.println("------------");

        obj.deletefrombegning();
        obj.display();
        System.out.println("------------");



    }

}
