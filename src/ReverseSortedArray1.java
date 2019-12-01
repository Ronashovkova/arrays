import java.util.Arrays;
import java.util.Collections;

public class ReverseSortedArray1 {

    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 7, 11};
        Arrays.sort(arr, Collections.reverseOrder());

        for (Integer values : arr) {
            System.out.print(values + " ");
        }
    }
}
