import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // 'A'  Minimum sleep
        int B = scanner.nextInt(); // 'B' Maximum sleep
        int H = scanner.nextInt(); // 'H' Ann's sleep


        if (H < A){
            System.out.println("Deficiency");
        } else if (H > B) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}