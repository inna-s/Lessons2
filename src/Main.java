public class Main {
    public static void main(String[] args) {
    }

    public static int sorting(int[] numbers, int num) {
        int[] numbers = {5, 21, 19, 55, 94, 73, 69, 100};
        for (int num : numbers) {
            System.out.print(num + ",");

            int j = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    j = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = j;


                }
            }
        }
     return (?)
}}
    public static int binarySearch(int[] num ;int key) {
        int low = 0;
        int high = num.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (key < num[middle]) {
                high = middle - 1;
            } else if (key > num[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }

        } return -1
