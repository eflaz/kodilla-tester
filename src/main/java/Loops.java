public class Loops {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3,4};
        sumNumbers (numbers);
        }


    public static int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

    }

