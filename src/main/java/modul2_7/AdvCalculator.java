package modul2_7;

public class AdvCalculator {
    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        double result = 0;
        switch (userSelected) {
            case "ADD": return a + b;
            case "SUB": return a - b;
            case "DIV": return a / b;
            case "MUL": return a * b;
            default: return 0;
        }
    }
}
