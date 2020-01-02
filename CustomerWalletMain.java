package wallet.ui;

import java.util.*;

import wallet.entity.CustomerWallet;

public class CustomerWalletMain {
	public static void main(String[] args) {
	
	CustomerWalletMain m= new CustomerWalletMain();
	m.execute();
	}
	Map<String, CustomerWallet> store = new HashMap<>();
	
	public void execute() {
		
		

		CustomerWallet c1 = new CustomerWallet("7654", "ram", 7600);
		store.put("7654", c1);
		CustomerWallet c2 = new CustomerWallet("9876", "haritha", 4000);
		store.put("9876", c2);
		CustomerWallet c3 = new CustomerWallet("9894", " sam", 2000);
		store.put("9894", c3);
		CustomerWallet c4 = new CustomerWallet("9870", "krishna", 4000);
		store.put("9870", c4);
		print();
		CustomerWallet fetched = findBymobileNo("9876");
		System.out.println(fetched.getName());
		System.out.println("customer with the number");
		print();

		c2.transferamount(c3, 300);
		store.put("9876", c2);
		System.out.println("Amount has been transfered");
		
		print();

	}

	public CustomerWallet findBymobileNo(String mobileNo) {
		CustomerWallet e = store.get(mobileNo);
		return e;
	}

	public void print() {
		Set<String> keys = store.keySet();
		for (String mobileNo : keys) {
			CustomerWallet e = store.get(mobileNo);
			System.out.println(e.getName() +"     "+ e.getBalance());
		}

	}
}
