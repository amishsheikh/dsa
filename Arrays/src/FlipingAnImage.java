import java.util.Arrays;

public class FlipingAnImage {
    public static void main(String[] args) {
        int[][] arr ={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));



    }

    public  static int[][] flipAndInvertImage(int[][] image) {
        int[][] res=new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                res[i][j]=image[i][j]^1;
            }
        }
        revers(res);
        return res;
    }

    static void revers(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int s= 0;
            int e= arr.length-1;
            while (s<e){
                int temp=arr[i][s];
                arr[i][s]=arr[i][e];
                arr[i][e]=temp;
                s++;e--;
            }
        }
    }

}
