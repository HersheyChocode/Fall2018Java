package w6day2;
//import java.util.Scanner;
public class BankAccountTest {
	public static void main(String[] args) {
		int sumOfPrimes = sumOfPrimes(1000);
		BankAccount Hershey = new BankAccount (5839,1000);
		BankAccount Sriram = new BankAccount(5976,500);
		BankAccount Neeha = new BankAccount(86784,796);
		BankAccount PrimeSum = new BankAccount(0,sumOfPrimes);
		//Scanner checkPassword = new Scanner(System.in);
		//System.out.print("Enter your password: ");
		//int password = checkPassword.nextInt();
		System.out.println(Hershey.getBalance(5839));
		Hershey.withdraw(5839, 1000);
		Sriram.withdraw(5976, 500);
		Neeha.withdraw(86784, 796);
		System.out.println(Hershey.getBalance(5839));
		System.out.println(Sriram.getBalance(5976));		
		System.out.println(Neeha.getBalance(86784));
		System.out.println(PrimeSum.getBalance(0));
		
		System.out.println(BankAccount.overdrawPenalty);
		System.out.println(BankAccount.interestRate());
			
	}
	
	public static boolean isAPrime(int x) {
		for(int i = 2; i < Math.sqrt(x); i++){
			if(x % i==0) {
			return false;
			}
		}
		return true;
	}
	public static int sumOfPrimes(int i) {
		int sum = 0;
		for (int x=1; x<=i; x++) {
			if(isAPrime(x)==true) {
				sum += x;
			}
		}
		return sum;
	}
}
