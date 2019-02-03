package w8day1;
//import java.util.Scanner;
public class BankAccountTest {
	public static void main(String[] args) {
		int sumOfPrimes = sumOfPrimes(1000);
		BankAccount PrimeSum = new BankAccount(0,sumOfPrimes);
		//Scanner checkPassword = new Scanner(System.in);
		//System.out.print("Enter your password: ");
		//int password = checkPassword.nextInt();
		System.out.println(PrimeSum.getBalance(0));
		changeAmt(PrimeSum);
		System.out.println(PrimeSum.getBalance(0));
		System.out.println(changeAmt(sumOfPrimes));
		System.out.println(PrimeSum.toString());
	}
	public static void changeAmt(BankAccount BankAccount) {
		BankAccount.balance += 100;
	}
	public static double changeAmt(double balance) {
		return (balance = 100);
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