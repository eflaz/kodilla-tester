
public class FirstClass {                           // [1]
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 150);
        System.out.println("notebook.weight: " + notebook.weight);
        System.out.println("notebook.price: " + notebook.price);

        Notebook heavyNotebook = new Notebook(2000, 200);
        System.out.println(heavyNotebook.weight + heavyNotebook.price);


        Notebook oldNotebook = new Notebook(1200, 300);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);


    }
}
