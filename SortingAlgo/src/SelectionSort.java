import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,10,3,2,1};
        System.out.println(Arrays.toString(ans(arr)));
    }
    static int[] ans(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
            }
        }
            if (min!=i){
                swap(arr,min,i);
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
