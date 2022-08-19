import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
            int[] arr={1,1,1,1};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans =new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp =1;
            for (int j = 0; j < nums.length; j++) {

                if(i!=j){
                    temp =temp*nums[j];
                    ans[i]=temp;

                }
                else
                    continue;
            }

        }
        return ans;
    }

//    optimization
    static int[] ans(int[] nums){
        int[] ans =new int[nums.length];
        int product=1;
        for (int i = 0; i < nums.length; i++) {
            product*=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i]=product/nums[i];
        }
        return ans;
    }
}
