package DSA.list;

public class Main {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
/*  adding manually
        ListNode p1 = new ListNode(10);
        ListNode p2 = new ListNode(20);
        ListNode p3 = new ListNode(30);
        ListNode p4 = new ListNode(40);
        ListNode p5 = new ListNode(50);

        l1.head=p1;
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        l1.printLinkedList();*/
// adding data calling add function
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(30);
        l1.add(30); //index =4
        l1.add(40);

//        l1.addFirst(12);
//        l1.addFirst(6);

        int e=30;
        System.out.println(l1.lastIndexOf(e));
        l1.printLinkedList();
        System.out.println(l1.size());

    }
}
