import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementsInTheRange {
    public static void main(String[] args) {
int[] arr ={1,4,5,2,7,8,3};
        System.out.println(check_elements(arr,7,2,5));;
    }

     static boolean check_elements(int arr[], int n, int A, int B)
    {
        Arrays.sort(arr);
        List<Integer> sc = new ArrayList<>();
        for (int i:arr) {
            sc.add(i);
        }
        for (int i = A; i <= B ; i++) {
            if(!sc.contains(i))
                return false;


        }
return true;
    }
}
