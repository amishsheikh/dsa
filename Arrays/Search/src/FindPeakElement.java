public class FindPeakElement {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr));
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

}
