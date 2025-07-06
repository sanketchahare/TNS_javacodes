package CONDITIONALSTATEMENTS;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check voting eligibility (assuming minimum age is 18)
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}
