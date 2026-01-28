package LinkedList;

public class LLDemo {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }


    }
    Node head;//stores the address of first node

    //insertion at head TC=O(1)
    void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    //insertion at tail T.C=O(n)
    void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
//        newNode.next=temp.next;
        temp.next=newNode;
    }
    //insert at a given position TC=O(n)
    void insertAtGivenPosition(int data, int pos){
        if(pos<0){
            System.out.println("Invalid Position!");
            return;
        }
        if(pos==1){//if position is 1
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=1; i<pos-1 && temp!=null; i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position is out of range!");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    //delete at head TC=O(1)
    int deleteAtHead(){
        if(head==null){
            System.out.println("List is empty!");
            return -1;
        }
        int deletedValue = head.data;
        head=head.next;
        return  deletedValue;
    }
    //delete at tail T.C=O(n)
    int deleteAtTail(){
        if(head==null){ //if list is empty
            System.out.println("List is empty!");
            return -1;
        }
        //list have only one node
        if(head.next==null){
            int deletedValue=head.data;
            head=null;
            return deletedValue;
        }
        Node temp = head;
        while(temp.next.next!=null){//temp is on 2nd last
            temp=temp.next;
        }
        int deletedValue = temp.next.data;
        temp.next=null;
        return  deletedValue;
    }
    int deleteAtGivenPosition(int pos){
        //pos <=0
        if(pos<=0){
            System.out.println("Position Invalid!");
            return -1;
        }
        //head is null
        if(head==null){
            System.out.println("Position Invalid!");
            return -1;
        }
        //delete head
        if(pos==1){
            int deletedValue=head.data;
            head=head.next;
            return deletedValue;
        }
        Node temp = head;
        //move to (pos-1)
        for(int i=1; i<pos-1 && temp.next!=null; i++){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Position Invalid.");
            return -1;
        }
        int deletedValue = temp.next.data;
        temp.next=temp.next.next;
        return deletedValue;
    }
    //display list  TC=O(n)
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LLDemo list = new LLDemo();
        list.insertAtHead(5);
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.display();
        list.insertAtTail(6);
        list.display();
        list.insertAtGivenPosition(4,3);
        list.display();
        int a1=list.deleteAtHead();
        System.out.println(a1);
        list.display();
        int a2=list.deleteAtTail();
        System.out.println(a2);
        list.display();
        int a3= list.deleteAtGivenPosition(2);
        System.out.println(a3);
        list.display();
    }
}

