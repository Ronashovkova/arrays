public class ArithmeticAverage1 {
    public static void main(String[] args) {

        int[] arr = {-100, 50, 39, -23, 156};
        int length = arr.length;
        int sum = 0;

        for (int values : arr) {
            sum = sum + values;
        }

        double averageNumber = (double) sum / length;
        System.out.println("Arithmetic average is " + averageNumber);
    }
}

