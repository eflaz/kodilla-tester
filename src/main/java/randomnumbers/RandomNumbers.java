package randomnumbers;

import java.util.Random;

public class RandomNumbers {
    private int min = 30;
    private int max = 0;

    public void countMinMax(int max) {
        Random random = new Random();
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            if (temp < min) {
                min = temp;
            }
            if (temp > this.max) {
                this.max = temp;
            }

        }


    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
