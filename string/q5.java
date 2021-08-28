package string;

import java.util.Arrays;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        char []a=s1.toCharArray();
        Arrays.sort(a);
        s1=new String(a);
        a=s2.toCharArray();
        Arrays.sort(a);
        s2=new String(a);
        if(s1.equals(s2))
            System.out.println("anagram");
        else
            System.out.println("not");
    }
}
