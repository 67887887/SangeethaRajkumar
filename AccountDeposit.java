package assignment.week3.day1;

public class AccountDeposit extends BankingInformation {
	public void deposit() {

		System.out.println("Amount deposited in local branch");

	}
	
	public static void main(String[] args) {
		AccountDeposit ad=new AccountDeposit();
		ad.deposit();
	}

}
