package randomnumbers;

public class RandomNumbersRunner {
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.countMinMax(5000);
        System.out.println(randomNumbers.getMax());
        System.out.println(randomNumbers.getMin());
    }
}
