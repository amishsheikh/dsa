import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n1  =in.nextInt();
        String m  = Integer.toString(n1); // type casting integer to string
        int m1=m.length();
        System.out.println("Enter the string");
        String s= in.next();
        int  n =s.length();
        System.out.println(solution(  s,0,n-1));
        System.out.println(solution(m,0,m1-1));
    }

    static boolean solution(String s,int l,int r){
        if (l>=r){
            return true;
        }

        if (s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return solution(s,l+1,r-1);
    }
//time complexity O(n);
}
