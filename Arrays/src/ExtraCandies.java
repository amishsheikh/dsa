import java.awt.*;
import java.util.Arrays;

public class ExtraCandies {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        System.out.println(max(arr));
        System.out.println(Arrays.toString(kidsWithCandies(arr, 3)));;
    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] arr=new boolean[candies.length];
        int[] extra = new int[candies.length];
        int n= max(candies);
        for (int i = 0; i < candies.length; i++) {
            extra[i] =candies[i]+extraCandies;
            if (extra[i]>=n){
                arr[i]=true;
            }

        }
        return arr;
    }


    static int max(int[] arr){
        int maximum=0;
        for (int i = 0; i < arr.length; i++) {
            if (maximum<=arr[i]){
                maximum=arr[i];
            }
        }
        return maximum;
    }

}
