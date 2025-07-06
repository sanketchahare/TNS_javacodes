package Examples;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("chips");
			break;
		case 2:
			System.out.println("coldrink");
			break;
		case 3:
			System.out.println("chocolate");
			break;
		
		default:
		
			System.out.println("  GO HOME ");
		
		}

	}

}
