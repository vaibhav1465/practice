package com.company;
class Node2{
    int item;
    Node2 next;
}
class List2 {
    Node2 start;

    List2() {
        start = null;
    }

    void insertFirst(int d) {
        Node2 n = new Node2();
        n.item = d;
        if (start == null) {
            start = n;
            start.next = null;
        } else {
            n.next = start;
            start = n;
        }
    }

    void insertLast(int d) {
        Node2 n = new Node2();
        n.item = d;
        if (start == null) {
            start = n;
            start.next = null;
        } else {
            Node2 t = start;
            while (t.next != null)
                t = t.next;
            t.next = n;
            n.next = null;
        }
    }

    Node2 search(int d) {
        Node2 t = start;
        while (t != null) {
            if (t.item == d)
                return t;
            t = t.next;
        }
        return t;
    }

    void insertAfter(int d, int nd1) {
        Node2 n = search(d);
        if (n == null) {
            System.out.println("not found");
        } else {
            Node2 nd = new Node2();
            nd.item = nd1;
            nd.next = n.next;
            n.next = nd;
        }

    }

    void deleteFirst()
    {
        if(start==null)
        {
            System.out.println("emty");
        }
        else
        {
          start=start.next;
        }
    }
    void deleleLast() {
        if (start == null) {
            System.out.println("emty");
        } else {
            Node2 t = start;
            Node2 p = null;
            while (t.next != null) {
                p = t;
                t = t.next;
            }
            if (p == null)
                start = null;
            else
                p.next = null;
        }
    }
    void deleteElement(int d)
    {
        Node2 n=search(d);
        if(n==null)
            System.out.println("not found");
        else{
            if(n==start)
                deleteFirst();
            else if (n.next==null)
                deleleLast();
            else
            {
                Node2 t=start;
                while (t.next!=n)
                    t=t.next;
                t.next=n.next;
            }
        }
    }
    void reverse()
    {
        Node2 t=start,r=null;
        while(t.next!=null) {
            r=t;
            t = t.next;
        }
        r.next=null;
        Node2 ns=t;
        Node2 ns1=t;
        t=start;
        while(true)
        {
            r=null;
            while(t.next!=null){
                r=t;
                t=t.next;
            }
            ns.next=t;
            if(r!=null)
                r.next=null;
            ns=ns.next;
            t=start;
            if(t==r)
            {
                ns.next=start;
                break;
            }


        }
        start=ns1;



    }
    void viewList()
    {
        Node2 t=start;
        while(t!=null)
        {
            System.out.println(t.item);
            t=t.next;
        }
    }
}
public class singlyLinklist {
    public static void main(String[] args) {
        List2 l = new List2();
        l.insertFirst(10);
        l.insertLast(20);
        l.insertLast(30);
        l.insertFirst(5);
l.insertLast(40);
l.insertLast(50);
        l.reverse();
        l.viewList();
    }
}
