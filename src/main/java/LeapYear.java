public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 != 0) {
            return true;
        }
        if (year % 400 != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
       if (isLeapYear(2015)) {
           System.out.println("Yes, it is Leap year!");
       } else {
           System.out.println("No, it is not leap year!");
       }
    }
}
