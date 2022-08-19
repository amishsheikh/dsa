import java.util.Arrays;

import static java.lang.System.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,4,3,1};
        System.out.println(Arrays.toString(ans(arr)));
    }
    static int[] ans(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped=false; // by this statement we can modify the best  case time complexity O(1)
            for (int j = 1; j < arr.length-i; j++) {
            if (arr[j]<arr[j-1]){
                swapped=true;
                swap(arr,j,j-1);
            }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }

    static void swap(int[] arr,int s,int e){
        int temp=arr[s];
       arr[s]=arr[e];
       arr[e]=temp;
    }
}

