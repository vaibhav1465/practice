package com.company;
class Node{
    Node prev;
    int  item;
    Node next;
}
class List {
    Node start;

    List() {
        start = null;
    }

    void insertFirst(int d) {
        Node n = new Node();
        n.item = d;
        if (start == null) {
            start = n;
            start.next = start;
            start.prev = start;
        } else {
            n.prev = start.prev;
            n.next = start;
            start.prev.next = n;
            start.prev = n;
            start = n;
        }
    }

    void viewList() {
        Node t = start;
        while (true) {
            System.out.println(t.item);
            if (t.next == start)
                break;
            t = t.next;
        }
    }

    void insertLast(int d) {
        Node n = new Node();
        n.item = d;
        if (start == null) {
            start = n;
            start.next = start;
            start.prev = start;
        } else {
            n.prev = start.prev;
            n.next = start;
            start.prev.next = n;
            start.prev = n;
        }
    }

    Node search(int n) {
        Node s = start;
        while (true) {
            if (s.item == n)
                return s;
            s = s.next;
            if (s.next == start)
                if (s.item == n)
                    return s;
                else
                    return null;
        }
    }

    void insertAfter(int d, int nd1) {
        Node n = search(d);
        if (n == null)
            System.out.println("number not found");
        else {
            Node nd = new Node();
            nd.item = nd1;
            nd.prev = n;
            nd.next = n.next;
            n.next.prev = nd;
            n.next = nd;

        }
    }

    void deleteFirst() {
        if (start == null)
            System.out.println("empty");
        else {
            start.next.prev = start.prev;
            start.prev.next = start.next;
            start = start.next;
        }
    }

    void deleteLast() {
        if (start == null)
            System.out.println("empty");
        else {
            start.prev = start.prev.prev;
            start.prev.next = start;
        }
    }
    void deleteElement(int d)
    {
        Node n=search(d);
        if(n==start)
            deleteFirst();
        else if (n==start.prev)
            deleteLast();
        else {
            n.prev.next=n.next;
            n.next.prev=n.prev;
        }
    }
}

public class doublylinklist {
    public static void main(String[] args) {
        List l=new List();

    }
}
