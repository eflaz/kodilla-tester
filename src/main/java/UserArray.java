public class UserArray {
    public static void main(String[] args) {

        User jan = new User("Jan", 30);
        User ewa = new User("Ewa", 40);
        User iza = new User("Iza", 50);
        User ola = new User("Ola", 60);
        User ala = new User("Ala", 20);
        User[] users = {jan, ewa, iza, ola, ala};


        double sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].getAge();
        }
        double average = sum / users.length;
        for (int i = 0; i < users.length; i++) {
            if (average > users[i].getAge()) {
                System.out.println(users[i].getName());
            }

        }
    }


}
