package DSA.doublelinkedlist;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll= new DoublyLinkedList();

        /*Node temp=new Node(10);
        System.out.println(temp.data);
        System.out.println(temp.prev);
        System.out.println(temp.next);*/

        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);
        dll.add(50);

//        int [] ar ={1,2,3,4,5};

        dll.printAll();

        dll.removeFirst();
        dll.printAll();

        dll.removeLast();
        dll.printAll();

        System.out.println(dll.size());




    }

}
