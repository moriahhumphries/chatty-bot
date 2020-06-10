import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int groupA = scanner.nextInt();
        int groupB = scanner.nextInt();
        int groupC = scanner.nextInt();
//        int answer = (groupA + groupB + groupC + 1)  / 2;
//
//        System.out.println((int)Math.ceil(answer));
        int desksA = (groupA + 1) / 2;
        int desksB = (groupB + 1) / 2;
        int desksC = (groupC + 1) / 2;

        System.out.println(desksA + desksB + desksC);


    }
}