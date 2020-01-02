package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Exceptions.CustomerNotFoundException;
import Exceptions.IncorrectmobileNoException;
import entities.CustomerWallet;




public class CustomerDaoImpl implements ICustomerDao {
	  private Map<String, CustomerWallet> store = new HashMap<>();

	    public void addCustomerWallet(CustomerWallet e) {
	        store.put(e.getMobileNo(),e);
	    }

	    public CustomerWallet findCustomerWalletBymobileNo(String mobileNo) {
	        CustomerWallet e = store.get(mobileNo);
	        if (e==null){
	            throw new CustomerNotFoundException("customer not found");
	            
	        }
	        return e;
	    }   
@Override
	    public Set<CustomerWallet> allCustomers() {
	        Collection<CustomerWallet> customers = store.values();
	        Set<CustomerWallet> customerSet = new HashSet<>(customers);
	        return customerSet;
	    }
}
