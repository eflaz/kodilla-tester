package newcode;

public class Application {
    public static void main(String[] args) {
        User user = new User("Adam", 40.5, 178);

        if (user.getName() != null) {
            if (user.getAge() > 30 && user.getHeight() > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160 cm (or shorter)");
            }
        }
    }


}


