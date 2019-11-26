

public class Main {
    public static void main(String[] args) {
        int[] numbers;
        numbers = sorting(new int[]{5, 21, 19, 55, 94, 73, 69, 100,});
    }

    public static int[] sorting(int[] numbers) {
        for (int num : numbers)
            System.out.println(num);
        {
            int j = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    j = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = j;
                }
            }
        }
        return (numbers);
    }
}