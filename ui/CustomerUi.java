package ui;

import java.util.Collection;
import java.util.Set;

import dao.CustomerDaoImpl;
import dao.ICustomerDao;
import entities.CustomerWallet;
import service.CustomerServiceImpl;
import service.ICustomerService;

public class CustomerUi {
private ICustomerService service = new CustomerServiceImpl(new CustomerDaoImpl());

	    public static void main(String[] args) {
	        CustomerUi ui = new CustomerUi();
	        ui.runUi();
	    }

	    public void runUi() {
	        try {
	            CustomerWallet c1 = new CustomerWallet("9898", "chandra",3000);
	            CustomerWallet c2 = new CustomerWallet("7865", "satya",4900);
	            service.addCustomerWallet(c1);
	            service.addCustomerWallet(c2);
	             CustomerWallet fetched1 = service.findCustomerWalletBymobileNo("7865");
	            CustomerWallet fetched2 = service.findCustomerWalletBymobileNo("9898");
	            System.out.println(fetched1.getName());
	            System.out.println(fetched2.getName());
	            System.out.println("********printing all Customers****");
	            Set<CustomerWallet> customers = service.allCustomers();
	            print(customers);
	        }catch (Throwable e){
	            e.printStackTrace();
	            System.out.println("something went wrong");
	        }
	    }

	    void print(Collection<CustomerWallet>Customers){
	        for (CustomerWallet c:Customers){
	            System.out.println(c.getName());
	        }
	    }
	}



