package com.company;

public class Main1 {
    public static void main(String[] args) {
        BinarySeatchTree t1=new BinarySeatchTree();
        t1.insert(55);
        t1.insert(40);
        t1.insert(45);
        t1.insert(42);
        t1.insert(30);
        t1.insert(70);
        t1.insert(60);
        t1.insert(80);
        t1.insert(75);
        t1.insert(71);
        t1.insert(90);
        t1.delete(125);
        t1.viewList();
    }
}
