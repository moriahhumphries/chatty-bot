package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is CatChat.");
        System.out.println("I was created in 2020.");
        System.out.println("Please, remind me your name.");
        String yourName = scanner.next();

        // reading a name

        System.out.println("What a great name you have, " + yourName + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt(); //2
        int remainder5 = scanner.nextInt(); //2
        int remainder7 = scanner.nextInt(); //4
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        // reading all remainders

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
}
