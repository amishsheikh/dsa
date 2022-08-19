import java.util.Arrays;
import java.util.Scanner;

public class Raw
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        System.out.println("Enter the array limit ");
//        int n  = in.nextInt();
//        int[] arr= new int[n];
//        System.out.println("Enter the number in array till n ");
//        for (int i = 0; i < n; i++) {
//             arr[i] = in.nextInt();
//
//        }
////        System.out.println(Arrays.toString(arr));
//        int[] arr={1,2,3,4,5};
//        System.out.println(max(arr));;
        System.out.println(f(4));


    }

    static int f(int n){
        if (n == 0 || n==1) {
            return n;
        }
        else
            return (2*f(n-1)+3*f(n-2));
    }

    static boolean Age(int n){ // ye mene int direct function me he le liya esa he lena ka agr tu prouduct nikal
        //ra honga toh teko do argument lagege toh tu ese define kre ga fun(int a,int b)
        if (n>=18){
            return true;
        }
        return false;
    }
    static int product(int a,int b){
        return a*b;
    }
    static int max(int[] arr){
        int maximum=0;
        for (int i = 0; i < arr.length; i++) {
            if (maximum<=arr[i]){
                maximum=arr[i];
            }
        }
        return maximum;
    }
}
