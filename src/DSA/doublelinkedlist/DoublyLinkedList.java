package DSA.doublelinkedlist;

public class DoublyLinkedList {
    Node head;
    Node tail;

    // print : 1
    void printAll(){
        Node curr = head;
        if(curr == null){
            System.out.println("[]");
        }

        while(curr != null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    // reverse printing : 2
    void printReverse(){
        Node curr = tail;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr=curr.prev;
        }
        System.out.println();
    }

    // add last : 3
    void add(int element){
        Node temp = new Node(element);

        if(head == null){
            head=temp;
            tail=temp;
        }
        else if(head != null){
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
    }

    // add first : 4
    void addFirst(int element){
        Node temp = new Node(element);

        if(head == null){
            head = temp;
            tail=temp;
        }
        else if( head != null){
            head.prev=temp;
            temp.next=head;
            head=temp;
        }
    }

    // add by index : 5
    void add(int index, int element){
        if( index == 0){
            addFirst(element);
        }
        else{
            Node temp = new Node(element);
            int count=0;
            Node curr= head;
            while(count<index-1){
                curr=curr.next;
                count++;
            }
            curr.next.prev=temp;
            temp.next=curr.next;
            temp.prev=curr;
            curr.next=temp;
        }
    }

    // add all from array : 6
    void addAll(int [] elements){
        for(int element : elements){
            add(element);
        }
    }

    // remove first : 7
    void removeFirst(){
        if(head == null){

        }
        else if (head.next==null){
            head=null;
            tail=null;
        } else if (head.next != null) {
            Node curr= head;

            head=head.next;
            curr.next=null;
            head.prev=null;
           /* head.next.prev=null;
            head=head.next;*/
        }

    }

    // remove last : 8
    void removeLast(){
        if(head == null){

        }
        else if (head.next==null){
            head=null;
            tail=null;
        } else if (tail.prev != null) {
            /*tail.prev.next=null;
            tail=tail.prev;*/

            Node curr = tail;
            tail=tail.prev;
            curr.prev=null;
            tail.next=null;
        }
    }

    // size : 10

    int size(){
        Node curr=head;
        int count=0;

        while(curr != null){
            count++;
            curr=curr.next;
        }
        return count;
    }

}
