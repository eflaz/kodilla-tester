package newcode;

public class User {
    private String name;
    private double age;
    private double height;


    public User(String name, double age, double height) {

        this.name = name;
        this.age = age;
        this.height = height;
    }

    double getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    double getHeight() {
        return height;
    }


}
