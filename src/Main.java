public class Main {
    public static void main(String[] args) {
       int[] numbers;
        numbers = sorting(new int[]{5, 21, 19, 55, 94, 73, 69, 100,});

        int[] num = binarySearch(new int[] {5, 19, 21, 55, 69, 73, 94, 100,},key);


    }

    public static int[] sorting(int[] numbers) {

        for (int num : numbers) {
            int j = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    j = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = j;
                }
            }
            System.out.print(num + ",");
        }
        return (numbers);

    }

    public static int binarySearch(int key, int[] num) {
        int low = 0;
        int high = num.length - 1;
        while (low<=high) {
            int middle = low + (high-low)/2;
            if(key< num[middle]) {
                high = middle-1;
            } else if (key > num[middle]) {
                low = middle+1;
            }else {
                return middle;
            }

        }
        System.out.println(key);
     return -1;}}
