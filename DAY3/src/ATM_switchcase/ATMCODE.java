package ATM_switchcase;



	import java.util.Scanner;
	public class ATMCODE {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        double balance = 1000.00;
	        int correctPin = 1234;
	        int pin;

	        
	        System.out.print("Enter your PIN: ");
	        pin = scanner.nextInt();

	        if (pin != correctPin) {
	            System.out.println("Incorrect PIN. Access denied.");
	            return;
	        }

	        int choice;
	        do {
	            
	            System.out.println("\n===== ATM Menu =====");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    
	                    System.out.printf("Your balance is: ₹%.2f\n", balance);
	                    break;

	                case 2:
	                    
	                    System.out.print("Enter amount to deposit: ₹");
	                    double deposit = scanner.nextDouble();
	                    if (deposit <= 0) {
	                        System.out.println("Invalid deposit amount.");
	                    } else {
	                        balance += deposit;
	                        System.out.printf("₹%.2f deposited successfully.\n", deposit);
	                    }
	                    break;

	                case 3:

	                    System.out.print("Enter amount to withdraw: ₹");
	                    double withdraw = scanner.nextDouble();
	                    if (withdraw <= 0) {
	                        System.out.println("Invalid withdrawal amount.");
	                    } else if (withdraw > balance) {
	                        System.out.println("Insufficient balance.");
	                    } else {
	                        balance -= withdraw;
	                        System.out.printf("₹%.2f withdrawn successfully.\n", withdraw);
	                    }
	                    break;

	                case 4:
	                    
	                    System.out.println("Thank you for using the ATM.");
	                    break;

	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }

	        } while (choice != 4);

	        scanner.close();
	    }
	}

