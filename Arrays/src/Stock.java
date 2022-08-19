public class Stock {
    public static void main(String[] args) {
        int[] arr ={7,1,4,3,8};
        System.out.println(min(arr));;
    }

//    static int ans(int[] arr){
//
//        for (int i = 0; i < arr.length; i++) {
//
//        }
//    }
    static int max(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    static int min(int[] arr) {
        int min = arr[0];
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
