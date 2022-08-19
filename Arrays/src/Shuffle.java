import java.util.Arrays;
import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
//        Scanner in =  new Scanner(System.in);
//        System.out.println("Input the value of n:" );
//        int n = in.nextInt();
//        int[] arr =new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i]= in.nextInt();
//        }
        System.out.println(Arrays.toString(shuffle(arr, 3)));

    }
    public  static int[] shuffle(int[] arr, int n) {
       int[] num = new int[2*n];
        for (int i = 0; i < n; i++) {
         num[i*2]=arr[i]; //0 2 4 ye position fill kre gi ye line
         num[(i*2)+1]=arr[n+i]; //1 3 5 ye position fill kre gi ye line
        }
        return num ;
    }
}
//this code will run like this 0 1 2 3 4 5