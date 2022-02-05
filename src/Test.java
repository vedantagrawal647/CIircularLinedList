class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
    }
}

class CircularSinglyLinkedList
{
    Node head;

    public void insertatlast(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
            head.next=head;
        }
        else
        {
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=head;

        }
    }

    public void insertatbegning(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
            head.next=head;
        }
        else
        {
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=head;
            head=newnode;
        }
    }

    public void deletefrombegning()
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
            head=head.next;
            temp.next=head;
        }
    }

    public void deletefromlast()
    {
        if(head==null)
        {
            System.out.println("empty list");
        }
        else
        {
            if(head.next==head)
            {
              head=null;
            }
            else
            {
                Node temp = head;
                while (temp.next.next != head) {
                    temp = temp.next;
                }
                temp.next=head;
            }

        }
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("list is empty");
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
public class Test {
    public static void main(String[] args) {
        CircularSinglyLinkedList obj1=new CircularSinglyLinkedList();
        obj1.insertatlast(new Node(10));
        obj1.insertatlast(new Node(20));
        obj1.insertatlast(new Node(30));
        obj1.display();
        System.out.println("----------");

        obj1.insertatbegning(new Node(40));
        obj1.display();
        System.out.println("----------");

        obj1.insertatbegning(new Node(50));
        obj1.display();
        System.out.println("----------");

        obj1.deletefrombegning();
        obj1.display();
        System.out.println("----------");

        obj1.deletefromlast();
        obj1.display();
        System.out.println("----------");

        obj1.deletefromlast();
        obj1.display();
        System.out.println("----------");

        obj1.deletefromlast();
        obj1.display();
        System.out.println("----------");

        obj1.deletefromlast();
        obj1.display();
        System.out.println("----------");
    }
}
