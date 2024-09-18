import java.util.Scanner;

abstract class Accounts{
	int accountNumber;
	String accountHolderName;
	long mobile;
	double Balance;

	abstract void withdrawal(double r);
	abstract void deposit(double r);
	abstract void display();
}

class SavingAccount extends Accounts{
	void withdrawal(double r){
		if(Balance - r >= 0){
			Balance -= r;
			System.out.println("Withdrawal of Rs:"+r+" is Successful");
		}
	}

	void deposit(double r){
		Balance += r;
		System.out.println("Deposit of Rs:"+r+" is Successful");
	}

	void display(){
		System.out.println("Account Holder Name:"+accountHolderName);
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Mobile Number:"+mobile);
		System.out.println("Account Balance:"+Balance);
	}
}

class p3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		SavingAccount a = new SavingAccount();
		System.out.print("Enter Account Holder Name: ");
		a.accountHolderName = sc.nextLine();

		System.out.print("Enter Account Number: ");
		a.accountNumber = sc.nextInt();

		System.out.print("Enter Mobile Number: ");
		a.mobile = sc.nextLong();

		System.out.print("Enter Balance: ");
		a.Balance = sc.nextDouble();
		a.display();

		System.out.print("How much you want to withdraw: ");
		double r = sc.nextDouble();
		a.withdrawal(r);

		System.out.print("How much you want to Deposit: ");
                double p = sc.nextDouble();
                a.deposit(p);
		
		a.display();
	}
}
