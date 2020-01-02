package entities;



public class CustomerWallet {private Object mobileNo;
private String name;
private double balance;


public CustomerWallet(String mobileNo ,String name,double balance) 
{
	this.mobileNo=mobileNo;
	this.name=name;
	this.balance=balance;

}

public String getMobileNo() {
	return (String) mobileNo;
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

@Override
public String toString() {
    String display=mobileNo+" "+name +" "+balance;
    return display;
}

@Override
public boolean equals(Object obj) {
  
    if(obj==this){
        return true;
    }
   
    if(obj ==null|| !(obj instanceof CustomerWallet)){
        return false;
    }
    
    CustomerWallet e=(CustomerWallet)obj;
    return e.mobileNo==this.mobileNo;

}

@Override
public int hashCode() {
    return  mobileNo.hashCode();
}
}



