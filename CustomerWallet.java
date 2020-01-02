package wallet.entity;

public class CustomerWallet {
	private Object mobileNo;
	private String name;
	private double balance;


	public CustomerWallet(String mobileNo ,String name,double balance) 
	{
		this.mobileNo=mobileNo;
		this.name=name;
		this.balance=balance;

	}

	public Object getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Object mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void addbalance(double amount) {
		this.balance = this.balance + amount;
	}

	public void transferamount(CustomerWallet a, double amount) {
		this.balance = this.balance - amount;
		a.balance = a.balance + amount;
	}
}


