
public class Main {
    public static void main(String[] args ) {
        int[] numbers = {5, 21, 19, 55, 94, 73, 69, 100};
        for (int num : numbers) {
            System.out.print(num + ",");
            int repeat = 0;
            int j = 0;

            do {
                for (int i = 0; i < numbers.length-1; i++) {
                    if (numbers[i] > numbers[i + 1]) {
                        j = numbers[i];
                        numbers[i] = numbers[i + 1];
                        numbers[i + 1] = j;
                        repeat++;
                    }
                }
            }
            while (repeat > 0);
            System.out.println();
        }
            for (int num: numbers) {
                System.out.print(num + ",");


            }

        }
    }