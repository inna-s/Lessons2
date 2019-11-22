
public class Main {
    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[4];
        numbers[0] = 5;
        numbers[1] = 3;
        numbers[2] = 2;
        numbers[3] = 7;
        int i = 0;
        int number;
        number = numbers[i];
        boolean unsorting = false;
        for (i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[i + 1]) {
                    do {
                        j = numbers[i];
                        numbers[i] = numbers[i + 1];
                        numbers[i + 1] = j;
                    }
                    while (false);
                    {
                        boolean sorting = true;
                        {  if (numbers[i] < numbers[i + 1]) ;
                        while (numbers[i]<numbers.length)
                            System.out.println(numbers[i++]);
                            }


                        }
                    }
                }
            }
        }
    }

