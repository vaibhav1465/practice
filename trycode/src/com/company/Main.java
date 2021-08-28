package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	phonebook[] list =new phonebook[n];
	for(int i=0;i<n;i++)
	    list[i]=new phonebook(sc.next(),sc.next());
	int q=sc.nextInt();
	String[] name=new String[q];
	int j;
        for(int i=0;i<q;i++)
        name[i]=sc.next();
	for(int i=0;i<q;i++)
    {
        for(j=0;j<n;j++)
        {
            if(name[i].equals(list[j].getName())) {
                System.out.println(name[i] + "=" + list[j].getPhone());
                break;
                //System.out.println(true);
            }
        }
        if(j==n)
            System.out.println("Not found");
    }
    }
}
