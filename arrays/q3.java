package arrays;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
     int b,s,i,j,c;
     int a[];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of branches");
        b=sc.nextInt();
        a=new int[b];
        for(i=0;i<b;i++)
        {
            s=0;
            System.out.println("enter no of courses in "+(i+1)+" branch");
            c=sc.nextInt();
            for(j=0;j<c;j++)
            {
                System.out.println("enter no of Students in "+(j+1)+" course");
                s+=sc.nextInt();
            }
            a[i]=s;
        }
        for(i=0;i<b;i++)
            System.out.println("No of Students in "+(i+1)+" Branch :"+a[i]);
    }
}
