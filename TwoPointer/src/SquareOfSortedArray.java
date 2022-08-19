import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
//            int[] arr ={-4,-1,0,3,10};
            int[] arr={0,9,16,100,1};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
//time complexity O(N*2)
    public  static int[] sortedSquares(int[] nums) {
        int[] arr= square(nums);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length ; j++) {
                if (arr[j]<arr[j-1]){
                    swap(arr,i,j );
                }
            }
        }

        return arr;
    }

    static int[] square(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*arr[i];
        }
        return arr;
    }

    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}