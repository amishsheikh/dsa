//program to return the max sum of sub-array

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr={-1,-2,-3};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int maxsum=0;
        int currsum=0;
        for (int i = 0; i < arr.length; i++) {
            currsum =currsum+arr[i];
            if (maxsum<currsum){
                maxsum=currsum;
            }
            else if(currsum<0){
                currsum=0;
            }

        }
        return maxsum;
    }
//    time complexity O(n);
}
