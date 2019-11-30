public class Main {
    public static void main(String[] args) {
        long[] numbers;
        numbers = sorting(new long[]{5, 21, 19, 55, 94, 73, 69, 100,});


        System.out.println(binarySearch(73, new int[]{5, 19, 21, 55, 69, 73, 94, 100,}));

    }

    public static long[] sorting(long [] numbers) {
        int[] intNumbers = new int[numbers.length];
        for (long num : numbers) {
            long j = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
                intNumbers [i] = (int) numbers[i];
                if (numbers[i] > numbers[i + 1]) {
                    j = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = j;



                }
            }
            System.out.println(num + ",");
        }
        return (numbers);

    }

    public static int binarySearch(int key, int[] num) {

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

        }

        return -1;
    }
}