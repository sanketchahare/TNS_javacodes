package CONDITIONALSTATEMENTS;

import java.util.Scanner;

public class BloodDonationEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age and weight
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter weight (in kg): ");
        int weight = scanner.nextInt();

        // Check eligibility
        if (age >= 18 && weight >= 50) {
            System.out.println("You are eligible to donate blood.");
        } else {
            System.out.println("You are not eligible to donate blood.");
        }

        scanner.close();
    }
}
