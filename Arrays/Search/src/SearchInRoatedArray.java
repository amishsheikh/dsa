public class SearchInRoatedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3};
        System.out.println(pivot(arr));
        System.out.println(rotate(arr,3 ));
    }
static int rotate(int[] nums, int target){
        int start=0;

        int end =nums.length-1;
        int pivot=pivot(nums);
        if (pivot==-1){
            return binarySearch(nums,0,nums.length-1,target);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if (target>=nums[0]) {
            return binarySearch(nums,0,pivot-1,target);
        }

          return  binarySearch(nums,pivot+1,nums.length-1,target);
}
    static int pivot(int[] arr){
        int start =0 ;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            } else if (mid>start&&arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            else if (arr[mid]<=arr[start]){
                end=mid-1;
            }else
                start=mid+1;
        }
        return -1;
    }
    static int binarySearch(int[] arr,int start,int end,int target){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]<target){
                start=mid+1;
            }
            else if (arr[mid]>target){
                end=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
}
