package string;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c_a=0,c_n=0,c_s=0,l=s.length(),i=0;
        while(l!=i)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z'))
                c_a++;
            else if (s.charAt(i)>='0' && s.charAt(i)<='9')
                c_n++;
            else
                c_s++;
            i++;

        }
        System.out.println("alphabet : "+c_a);
        System.out.println("number : "+c_n);
        System.out.println("special : "+c_s);

    }
}
