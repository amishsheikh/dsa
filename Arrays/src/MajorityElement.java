import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr ={1,1,1,3,4};
        System.out.println(ans(arr,5));
    }

    static int ans(int[] arr,int n){
        Arrays.sort(arr);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>n/2){
                return arr[i];
            }
        }
        return -1;
    }

}
