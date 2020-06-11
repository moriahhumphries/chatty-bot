import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if ((input >= 19) || (input > -15 && input <= 12) || (input > 14 && input < 17)) {
                System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}