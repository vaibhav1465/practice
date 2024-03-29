package com.company;
class Node1{
    Node1 prev;
    int item;
    Node1 next;
}
class List1 {
    Node1 start;

    List1() {
        start = null;
    }

    void insertFirst(int d) {
        Node1 n = new Node1();
        n.item = d;
        if (start == null) {
            start = n;
            start.next = null;
            start.prev = null;
        } else {
            n.prev = null;
            n.next = start;
            start.prev = n;
            start = n;
        }


    }

    void insertLast(int d) {
        Node1 n = new Node1();
        n.item = d;
        if (start == null) {
            start = n;
            start.prev = start;
            start.next = start;
        } else {
            Node1 t = start;
            while (t.next != null)
                t = t.next;
            t.next = n;
            n.prev = t;
            n.next = null;
        }
    }

    Node1 search(int d) {
        Node1 t = start;
        while (t != null) {
            if (t.item == d)
                return t;
            t = t.next;
        }
        return t;
    }

    void insertAfter(int d, int nd1) {
        Node1 n = search(d);
        if (n == null)
            System.out.println("not found");
        else {
            Node1 nd = new Node1();
            if (n.next == null)
                insertLast(nd1);
            else {
                nd.item = nd1;
                nd.next = n.next;
                nd.prev = n;
                n.next.prev = nd;
                n.next = nd;
                 }
            }

        }
        void deleteFirst () {
            if (start == null)
                System.out.println("empty");
            else {
                start.next.prev = null;
                start = start.next;
            }
        }
        void deleteLast () {
            if (start == null)
                System.out.println("empty");
            else {
                Node1 t = start;
                while (t.next != null)
                    t = t.next;
                t.prev.next = null;
            }
        }
        void deleteElement ( int d)
        {
            Node1 n = search(d);
            if (n == null)
                System.out.println("not found");
            else {
                if (n == start)
                    deleteFirst();
                else if (n.next == null)
                    deleteLast();
                else {
                    n.prev.next = n.next;
                    n.next.prev = n.prev;
                }
            }
        }
        void viewList()
        {
            Node1 t = start;
            while (t != null) {
                System.out.println(t.item);
                t = t.next;
            }
        }
    }
public class doublysimplelist {
    public static void main(String[] args) {
        List1 l=new List1();
    }

}
