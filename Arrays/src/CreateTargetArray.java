// https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {
    public static void main(String[] args) {
int[] arr = {0,1,2,3,4};
int[] index ={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray1(arr, index)));
    }

static int n;
    public static int[] createTargetArray(int[] nums, int[] index) {
        for (int i=0;i<index.length;i++) {
            for (int j=0;j<i;j++) {
                if (index[j]>=index[i]) {
                    index[j]++;
                }
            }
        }
        int[] res = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            res[index[i]] = nums[i];
        }
        return res;
    }

    public static int[] createTargetArray1(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<index.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] arr= new int[nums.length];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
