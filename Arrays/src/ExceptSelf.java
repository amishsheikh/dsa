import java.util.Arrays;

public class ExceptSelf {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4};
        int[] arr={0,0};
        System.out.println(Arrays.toString(ans(arr)));
    }

    static int[] ans(int[] arr){
        int[] left =new int[arr.length];
        int[] right =new int[arr.length];
        int[] ans =new int[arr.length];
        int product=1;
        for (int i = 0; i < arr.length; i++) {
            product*=arr[i];
            left[i]=product;
        }
         product=1;
        for (int i = arr.length-1; i >=0 ; i--) {
            right[i]=product;
            product*=arr[i];
        }
            left[0]=arr[1];


        for (int i = 1; i < arr.length; i++) {
            if (right[i+1]> arr.length&&left[i-1]> 0){
                ans[i]=left[i-1]*arr[arr.length-2];
            }
            else if(left[i-1]< 0&& right[i+1]<arr.length){
                ans[i]=arr[1]*right[i+1];
            }
           if (left[i-1]>0&&right[i+1]< arr.length){
               ans[i]=left[i-1]*right[i+1];
           }
        }
        return ans;
    }

}
