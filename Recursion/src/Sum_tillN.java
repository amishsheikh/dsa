public class Sum_tillN {
    public static void main(String[] args) {
//        System.out.println(sum1(10));
        System.out.println(power(3,4));
    }

    static int sum(int n){
        if (n==0){
            return n;
        }
        return n+sum(n-1);
    }
    static int sum1(int n){
        return n*(n+1)/2;
    }
//using recursion
    static int power(int a,int b){
        if (b==0){
            return 1;
        }
        return power(a,b-1)*a; // a^b = a^b-1 * a
    }
}
