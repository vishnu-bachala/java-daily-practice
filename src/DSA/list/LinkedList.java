package DSA.list;

import java.util.List;

public class LinkedList {
    ListNode head;

    void printLinkedList(){
        ListNode curr = this.head;

        while(curr != null){
            System.out.print(curr.data+ " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void add(int e){
        ListNode temp = new ListNode(e);

        if(head==null){
            head=temp;
        }
        else {
            ListNode curr= head;
            while(curr.next != null){
                curr=curr.next;
            }
            curr.next=temp;
        }
    }

    void addFirst(int e){
        ListNode temp = new ListNode(e);

        if(head == null){
            head=temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }

    void add(int index, int element) throws IndexOutOfBoundsException{
        try{
            if(index == 0){
                addFirst(element);
            }
            else{
                ListNode temp = new ListNode(element);
                ListNode curr=head;
                int count=0;

                while(count < index-1){
                    curr = curr.next;
                    count++;
                }
                temp.next = curr.next;
                curr.next =temp;
            }

        }catch (NullPointerException e){
            throw new IndexOutOfBoundsException();
        }
    }

    void addAll(int[] elements){
        for(int element : elements){
            add(element);
        }
    }

    void removeFirst(){
        if(head == null){}
        else if(head.next == null){
            head=null;
        }
        else if(head.next != null){
            ListNode curr=head;
            head = head.next;
            curr.next=null;
        }
    }

    void removeLast(){
        if(head==null){

        }
        else if(head.next == null){
            head = null;
        }
        else if(head.next != null){
            ListNode curr =head;
            while(curr.next.next != null){
                curr=curr.next;
            }
            curr.next=null;
        }
    }

    int indexOf(int element){
        ListNode curr=head;
        int index =0;

        while(curr != null){
            if(curr.data == element){
                return index;
            }
            curr = curr.next;
            index ++;
        }
        return -1;
    }

    // find matching element from back side
    int lastIndexOf(int element){
        ListNode curr=head;
        int index=0;
        int indexOfElement=-1;

        while(curr != null){
            if(curr.data == element){
                indexOfElement=index;
            }
            curr = curr.next;
            index++;
        }
        return indexOfElement;
    }

    int size(){
        ListNode curr=head;
        int count=0;

        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

}
