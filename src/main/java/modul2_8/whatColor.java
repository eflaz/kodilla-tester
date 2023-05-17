package modul2_8;

import java.util.Scanner;

public class whatColor {
    public static String getColorLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select color letter (B-blue, R-red, W-white, O-orange, P-pink): ");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "B":
                    return "BLUE";
                case "R":
                    return "RED";
                case "W":
                    return "WHITE";
                case "O":
                    return "ORANGE";
                case "G":
                    return "GREEN";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
}
