import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
            int[] arr ={-1,-100,3,99};

        System.out.println(Arrays.toString( ans(arr,3)));


    }

    public static void rotate(int[] nums, int k) {
        int[] numsCopy = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            int nextIndex = (i + k) % nums.length;
            nums[nextIndex] = numsCopy[i];
        }}

    static int[] ans(int[] nums,int k){
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            list.add(i);
        }

        int i=0;
        int j= nums.length-1;
        while (k>=0){
            list.add(i,nums[j]);
            j--;k--;
        }
        for (int l = 0; l < nums.length; l++) {
            nums[l]= list.get(l);
        }

        return nums;
    }
}
