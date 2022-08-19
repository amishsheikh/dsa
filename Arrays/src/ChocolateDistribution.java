import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] arr={7, 3, 2, 4, 9, 12, 56};
        System.out.println(ans(arr,5));
    }
    static int ans(int[] arr,int m){
        if (m==0||arr.length==0){
            return 0;
        }
        if (m>arr.length){
            return -1;
        }
        Arrays.sort(arr);
        int min=arr[arr.length-1];
        int minSoFar=0;

        for (int i = 0; i+m-1 < arr.length; i++) {
                minSoFar = arr[i+m-1]-arr[i];

            if (min>minSoFar){
                min=minSoFar;
            }
        }
        return  min;
    }
}
