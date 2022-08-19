public class NumberOfWaysInArray {
    public static void main(String[] args) {

    }

    static int solution(int n,int m){
        if (n==1 || m==1) {
            return 1;
        }

        return solution(n-1,m) +solution(n,m-1);
    }
}
