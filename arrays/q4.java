package arrays;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=0,c=0,i=0;
        float s=0;
        while(n!=0)
        {
            t=t*10+n%10;
            n=n/10;
            c++;
        }
        int a[]=new int[c];
        while(t!=0)
        {
            a[i++]=t%10;
            t=t/10;
        }
        for(i=0;i<c;i++) {
            System.out.print(a[i] + " ");
            s += a[i];
        }
        System.out.println("\n"+s+" "+ s/c);

    }
}
