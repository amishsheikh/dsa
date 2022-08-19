public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,3,5,6};
        System.out.println(searchInsert(arr,2));
    }

    static int searchInsert(int[] nums, int target)
    {
        int start=0;
        int end =nums.length-1;
        if (target>nums[end]){
            return end+1;
        }
        else if(target<nums[start])
            return -1;

        while (start<end){
            int mid =start+(end-start)/2;
            if(nums[mid]<target) {
                start = mid + 1;
            } else if (target<nums[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }


        }
        return  searchInsert(nums,target+1);
    }
}
