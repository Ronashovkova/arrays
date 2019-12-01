import java.util.Arrays;

public class ChangeDuplicates1 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 4, 2, 8, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; ++k) {
                if (arr[i] == arr[k]) {
                    arr[k] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}