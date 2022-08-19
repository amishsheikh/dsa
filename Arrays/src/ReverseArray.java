import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        revere(arr);
    }

    static void revere(int[] arr){
        List<Integer> list = new ArrayList<>();

       String s= Arrays.toString(arr);
//       int n =s.length();
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }


    }

}
