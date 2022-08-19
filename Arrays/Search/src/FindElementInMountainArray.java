public class FindElementInMountainArray {
    public static void main(String[] args) {
int[] arr={4,5,6,7,0,1,2};
        System.out.println(ans(arr,4));
    }

    static int ans(int[] nums,int target){

        int pivot= search(nums);

        int one =binarySearch(nums,0,pivot,target );
        int two = binarySearch(nums,pivot,nums.length-1,target );
        if (one>-1&&one<two ){
            return one;
        } else if (two==-1) {
            return one;
        } else
            return two;

    }
    static int search(int[] arr){
        int start=0;
        int end =arr.length-1;

        while (start<end){
            int mid = start+(end-start)/2;
            if (arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else if (arr[mid]>arr[mid+1]){
                end=mid;
            }
            else
                return start;
        }
        return start;
    }

    static int binarySearch(int[] arr,int start,int end,int target){

        while (start<end){
            int mid = start+(end-start)/2;
            if (arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end =mid-1;
            }
            else
                return mid;
        }
        return -1;
    }

}
