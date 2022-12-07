import java.util.*;
public class doublylinkedlist
{
   class Node 
    {
        int data;
        Node prev;
        Node next;

        public Node(int data)
        {
            this.data=data;
        }
    } 

    Node head=null,tail=null;

    public void insertAtEnd(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            head.prev=tail.next=null;
        }
        else
        {
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
            tail.next=null;
        }
    }

    public void insertAtBeginning(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
          {
            head=tail=newnode;
            head.prev=tail.next=null;
          }
        else
          {
            head.prev=newnode;
            newnode.next=head;
            head=newnode;
            head.prev=null;
          }
    }
    public void insertAfterValue(int data,int ele)
    {
        if(head==null)
          {
            System.out.println("The given previous node cannot be null");
            return;
          }
        
        Node newnode=new Node(data);
        Node current=head;
        while(current.next!=null)
            {
                if(current.data==ele)
                  {
                    newnode.prev=current;
                    newnode.next=current.next;
                    current.next.prev=newnode;
                    current.next=newnode;
                    return;
                  }
                current=current.next; 
            }
    }
      public void delete(int data)
       {
        Node current = head;
        if (head == null) 
        {
            System.out.println("List is empty");
            return;
        }
        while (current != null) 
        {
            if (current.data == data)
                break;
            current = current.next;
        }
        if (current == head)
         {
            head = current.next;
            current.next.prev = null;
        } 
        else
         {
            if (current.next == null) 
            {
                tail = current.prev;
                current.prev.next = null;
            }
             else 
             {
                current.next.prev = current.prev;
                current.prev.next = current.next;
             }
         }
    }

    
    public void display()
    {
      Node current=head;
      if(head==null)
        {System.out.println("List is empty");
         return;
        }
      System.out.println("Nodes of Doubly linked list: ");
      while(current!=null)
           {
            System.out.print(current.data+" ");
            current=current.next;
           }
      System.out.println();
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      doublylinkedlist list=new doublylinkedlist();
      int ch,ele,data;
      do{
        System.out.println("1.Insert at end\n2.Insert at Beginning\n3.Insert after value\n4.Delete\n5.Display");
        ch=s.nextInt();
        switch(ch)
        {
          case 1:System.out.println("Enter the data");
                 data=s.nextInt();
                 list.insertAtEnd(data);
                 break;
          case 2:System.out.println("Enter the data");
                 data=s.nextInt();
                 list.insertAtBeginning(data);
                 break;
          case 3:System.out.println("Enter the data of node after which new node is to be inserted");
                 ele=s.nextInt();
                 System.out.println("Enter the data");
                 data=s.nextInt();
                 list.insertAfterValue(data,ele);
                 break;
          case 4:System.out.println("Enter the data to be deleted");
                 data=s.nextInt();
                 list.delete(data);
                 break;
          case 5:list.display();
                 break;
          

        }
      }
      while(true);
      
    }

    
}