public class PowerSet {

    public static void main(String[] args) {
        String s ="abc";
        String curr= " ";
        solution(s,0,curr);
    }

    static void solution(String  s, int i, String  curr){

        if (i==s.length()){
            System.out.print(curr+" ");
            return;
        }

        solution(s,i+1,curr+ s.charAt(i));
        solution(s,i+1,curr);
    }
//    time complexity O(2^n)
}
