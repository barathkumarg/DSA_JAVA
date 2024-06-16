package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        SLinkedList linkedlist = new SLinkedList();

        linkedlist.insertFirst(1);
        linkedlist.insertLast(2);
        linkedlist.insertLast(3);
        linkedlist.insertLast(4);
        linkedlist.insertLast(5);

        linkedlist.display();

        //Reversing the linked list
        SLinkedList.Node prev = null;
        SLinkedList.Node current = SLinkedList.head;
        SLinkedList.Node next;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        SLinkedList.head = current;
        SLinkedList.display();
    }
}
