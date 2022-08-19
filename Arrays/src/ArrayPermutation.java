import java.util.Arrays;
//  https://leetcode.com/problems/build-array-from-permutation/
public class ArrayPermutation {
    public static void main(String[] args) {
        int[] arr= {1,2,3,3};
        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] arr){
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr[i]];
        }
        return res;
    }


}
