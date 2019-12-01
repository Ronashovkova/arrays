public class SumPositiveNumbers1 {
    public static void main(String[] args) {

        int[] arr = {-100, 50, 39, -23, 156};
        int sum = 0;

        for (int value : arr) {
            if (value > 0) {
                sum += value;
            }
        }
        System.out.print("Sum of positive numbers is " + sum);
    }
}
