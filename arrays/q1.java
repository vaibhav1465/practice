package arrays;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,h=Integer.MIN_VALUE,l=Integer.MAX_VALUE;
        int a[]=new int[10];
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
            if(h<a[i])
                h=a[i];
            if(l>a[i])
                l=a[i];
        }
        System.out.println(h+" "+l);
    }
}
