import java.util.Arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1}; //5,2,6,1,4,5,8,9
        System.out.println(ans(arr));
        System.out.println(ans1(arr));
    }

    static int ans(int[] arr){
        int max =0;
        int minSoFar=arr[0];
        for (int i = 0; i < arr.length; i++) {
            minSoFar=Math.min(minSoFar,arr[i]);
            int profit =arr[i]-minSoFar;
            max=Math.max(max,profit);
        }
        return max;
    } // O(N) O(1)

//    brute force
    static int ans1(int[] arr){
        Arrays.sort(arr);
//       int ans =max(arr)-min(arr);
//       return ans;
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
             ans =arr[arr.length-1]-arr[0];
        }
        return ans;
    } //O(N^2)

    static int max(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    static int min(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
            return i;
        }
        return min;
    }

}
