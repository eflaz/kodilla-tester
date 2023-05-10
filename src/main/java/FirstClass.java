
public class FirstClass {                           // [1]
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 150, 2011);
        System.out.println("notebook.weight: " + notebook.weight);
        System.out.println("notebook.price: " + notebook.price);
        System.out.println("notebook.year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkInfo();


        Notebook heavyNotebook = new Notebook(3000, 700, 2000);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkInfo();


        Notebook oldNotebook = new Notebook(1200, 2500, 2022);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkInfo();



    }
}
