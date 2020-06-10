//put imports you need here


import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();
//        System.out.println("What is your age?");
        String age = scanner.nextLine();
//        System.out.println("What is your education level?");
        String school = scanner.nextLine();
//        System.out.println("How many years of experience do you have?");
        String experience = scanner.nextLine();
//        System.out.println("What is your cuisine preference?");
        String cuisine = scanner.nextLine();
        System.out.println("The form for " + firstName + " is completed. " + "We will contact you if we need a chef that cooks " + cuisine + " dishes.");
        // put your code here
    }
}