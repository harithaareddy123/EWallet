package dao;

import java.util.Set;

import entities.CustomerWallet;

public interface ICustomerDao {
	void addCustomerWallet(CustomerWallet c);

    CustomerWallet findCustomerWalletBymobileNo(String mobileNo);

    Set<CustomerWallet> allCustomers();
}




