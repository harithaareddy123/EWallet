package service;

import java.util.Set;

import entities.CustomerWallet;

public interface ICustomerService {
	

	
	    void addCustomerWallet(CustomerWallet c);

	    CustomerWallet findCustomerWalletBymobileNo(String mobileNo);

	    Set<CustomerWallet> allCustomers();
	}



