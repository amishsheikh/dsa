public class Maximum_sum_InSubarray {
    public static void main(String[] args) {
        int[] arr={1,-2,3,4,-5,5,6,10,-5};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            int curr=0;
            if (max<arr[i]) {
                max=arr[i];
            }
            for (int j = i; j < arr.length; j++) {
                curr+=arr[j];
            }
            if (max<curr){
                max=curr;
            }
        }
        return max;
    }
}
