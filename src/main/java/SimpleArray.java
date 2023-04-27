public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[5];

        animals [0] = "lion";
        animals [1] = "tiger";
        animals [2] = "elephant";
        animals [3] = "snake";
        animals [4] = "zebra";

        String myAnimal = animals[3];

        System.out.println(myAnimal);

        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera elementów " + numberOfElements);

    }
}
