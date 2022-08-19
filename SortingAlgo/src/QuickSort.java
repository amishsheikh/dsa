import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={4,10,3,2,1};
        System.out.println(Arrays.toString(ans(arr,1,arr.length)));
    }

    static int[] ans(int[] arr,int l,int h){
     if (l<h){
         int pivot=partition(arr,l,h);
         ans(arr,l,pivot-1);
         ans(arr,pivot+1,h);
     }
         return arr;
    }

    static int partition(int[] arr,int l,int h){ // this will return the pivot element

        int i=l;
        int j=h;
        int pivot = arr[l];
        while (i<j){
            while (i<=h-1&&arr[i]<=pivot){
                i++;
            }
            while (j>=l&&arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr, i, j);
            }
        }
       swap(arr,j,l);
        return j;

    }
    static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
