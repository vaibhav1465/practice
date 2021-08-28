package string;

public class texting {
    public static void main(String[] args) {
        String s="vaibhav";
//        s=s.substring(2);
//        s=s.replace("ll","ll");
//        System.out.println(s);
//
//        System.out.println(s.charAt(0));
        //reverse a string
        for(int i=s.length()-1;i>=0;i--)
            s+=s.charAt(i);
        s=s.substring(7);
        System.out.println(s);
    }
}
