import java.util.Arrays;

public class RainwaterTrapping {
    public static void main(String[] args) {
        int[] arr ={3 ,1 ,2 ,4 ,0 ,1 ,3 ,2};
        System.out.println((ans(arr)));
    }
    static int ans(int[] height){
        int[] left = new int[height.length];

         left[0]=height[0];
        for (int i = 1; i < height.length; i++) {
           left[i]=Math.max(left[i-1],height[i] );
        }
        int max=height[height.length-1];
        int[] right = new int[height.length];
        for (int i = height.length-1; i>= 0; i--) {
            if (max<height[i]){
                max=height[i];
            }
            right[i]=max;
        }
        int ans=0;
        for (int i = 0; i < height.length; i++) {
            ans+=Math.min(left[i],right[i] )-height[i];
        }
        return ans ;
    }

}

/*This problem is based on array preprocessing
 you have to find the no of blocks in which water will trap
 blocks are placed horizontally row vice
 graphical representation for array 3 1 2 4 0 1 3 2
   3   |  5
 |     |     |
 |   | |     | |
 | | | |   | | |
 output will be 5+3=8
 */
