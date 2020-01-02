package service;

import java.util.Set;

import Exceptions.IncorrectmobileNoException;
import dao.ICustomerDao;
import entities.CustomerWallet;


public class CustomerServiceImpl implements ICustomerService {
	private ICustomerDao dao;
	
	 
    public CustomerServiceImpl(ICustomerDao dao) {
        this.dao = dao;
    }

    @Override
    public void addCustomerWallet(CustomerWallet e) {
        dao.addCustomerWallet(e);
    }

    @Override
    public CustomerWallet findCustomerWalletBymobileNo(String mobNo) {
        if ((mobNo.equals(null))||(mobNo.length()!=4)) {
            throw new IncorrectmobileNoException("mobileNo is incorrect");
        }
        CustomerWallet e = dao.findCustomerWalletBymobileNo(mobNo);
        return e;
    }
    @Override
    public Set<CustomerWallet> allCustomers() {
        Set<CustomerWallet> customers = dao.allCustomers();
        return customers;
    }

	

}
