package string;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i,j,f;
        for(i=0;i<s.length();i++)
        {
            f=0;
           for(j=0;j<s.length();j++)
           {
               String a=s.charAt(i)+"";
               String b=s.charAt(j)+"";
               if(a.equalsIgnoreCase(b))
                   f++;
           }
           if(f!=2)
           {
               if(i==0) {
                   s = s.substring(1);
                   i=-1;
               }
               else
               {
                   String s1=s.substring(0,i);
                   String t=s.charAt(i)+"";
                   s=s.replace(t,s1);
                   s=s.substring(1);
                   i=-1;
               }
           }

        }
        System.out.println(s);
    }
}
