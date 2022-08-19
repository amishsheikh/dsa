public class NthFibonacci {
    public static void main(String[] args) {
        System.out.println(solution(0));
        solution2(0);
    }

    static int solution(int n){
        if(n<=1){
            return n;
        }

        return solution(n-1)+solution(n-2);
    }

//    without using recursion
    static void solution2(int n){
        int num1=0;
        int num2=1;
        int count =0;
        while (count<=n){
            System.out.println(num1+" ");
            int num3=num1+num2;
            num1=num2;
            num2=num3;
            count++;
        }
    }
}
