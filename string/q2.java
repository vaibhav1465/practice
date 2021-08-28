package string;

import java.util.Arrays;
import java.util.Scanner;
// text-cases may not pass
// to be done again

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int l=s.length();
        char d[]=new char[l];
       int c[]=new int[7];
        int i;
        s=s.toUpperCase();
        char []s1=s.toCharArray();
        Arrays.sort(s1);
       s=new String(s1);
        int t,k=0;
        for(i=0;i<l;i++)
        {
            t=i;
            while(true)
            {
                t=s.indexOf(s.charAt(i),t+1);
                if(t==-1)
                    break;
                else {
                    c[k]++;
                    d[k] = s.charAt(i);
                }
            }
            if(c[k]>0)
            {
                i+=c[k];
                k++;
            }

        }
        for(i=0;i<k;i++)
            System.out.println(d[i]+" "+(++c[i]));

    }


}

