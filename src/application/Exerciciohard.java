package application;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exerciciohard {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			System.out.println();
			System.out.println("Account data: ");
			System.out.println(" Account:" + number + " , " + " Holder:" + holder + " , " + "Balance:$ " + initialDeposit);
			
			System.out.println();
			System.out.print("Enter a deposit value: ");
			double depositValue = sc.nextDouble();
			depositValue += initialDeposit;
			System.out.println("Updated Account data: ");
			System.out.println("Account:" + number + " , " + " Holder:" + holder + " , " + "Balance: $" + depositValue );
			
			System.out.println();
			System.out.print("Enter a withdraw value: ");
			double withdrawValue = sc.nextDouble();
			depositValue -= withdrawValue + 5.0;
			System.out.println("Updated Account data: ");
			System.out.println("Account:" + number + " , " + " Holder:" + holder + " , " + "Balance: $" + depositValue);
			
		}
		else  {
			System.out.println("Account data: ");
			double value = 0;
			System.out.println(" Account:" + number + " , " + " Holder:" + holder + " , " + "Balance: $" + value);
			
			System.out.print("Enter a deposit value: ");
			double depositValue = sc.nextDouble();
			System.out.println("Account:" + number + " , " + " Holder:" + holder + " , " + "Balance: $" + depositValue);
			
			System.out.print("Enter a withdraw value: ");
			double withdrawValue = sc.nextDouble();
			depositValue -= withdrawValue + 5.0;
			System.out.println("Updated Account data: ");
			System.out.println("Account:" + number + " , " + " Holder:" + holder + " , " + "Balance: $ " + depositValue );
		}
		
		
		
		
		
		sc.close();
	}
}
