public class Notebook {
   int weight;
   int price;
   int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price > 600 && this.price < 1000 ) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light");
        } else if (this.weight >1000 && this.weight < 2000) {
            System.out.println("This notebook is not so heavy");
        } else {
            System.out.println("This notebook is heavy");
        }
    }

    public void checkInfo() {
        if (this.price < 500 && this.year > 2010) {
            System.out.println("This notebook is cheap and old");
        } else if (this.price == 700 && this.year == 2000) {
            System.out.println("This notebook is old and rather cheap");
        } else {
            System.out.println("This notebook is rather expensive and new");
        }
    }
}
