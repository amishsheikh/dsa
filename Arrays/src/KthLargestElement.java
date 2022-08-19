import java.util.Arrays;
import java.util.Collections;

public class KthLargestElement {
    public static void main(String[] args) {
int[] arr={3,2,1,5,6,4};
        System.out.println(ans(arr,2));
//        System.out.println(Arrays.toString(reverse(arr)));;
    }

    static int ans(int[] arr,int k){

        int kth =0;
        // Sorting the array in descending order

        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            kth=arr[k];
        }
        return kth;
    }

    static void reverse(int a[])
    {
        int[] b = new int[a.length];
        int j = a.length;
        for (int i = 0; i < a.length; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
//        return b;
    }
}

