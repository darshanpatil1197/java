package in.ac.kletech.customer;


public abstract class Customer {
	String sCustomerID;
	String sCustomerName;
	String sphoneNo;
	double dbillAmount;
	
	public Customer() {}
	Customer(String sCustomerID, String sCustomerName,	String sphoneNo, double dbillAmount) {
		this.sCustomerID=sCustomerID;
		this.sCustomerName=sCustomerName;
		this.sphoneNo=sphoneNo;
		this.dbillAmount=dbillAmount;
	}
	
	public String toString() {
		return(sCustomerID + ":" + sCustomerName + ":" + sphoneNo);
	}
	
	abstract void computeBillAmount();
	void printCustomerDetails(Customer customers)
	{
		System.out.println("undefined\n");
	}

}

class RegularCustomer extends Customer {
	double discount;
	RegularCustomer() {}
	RegularCustomer(String sCustomerID, String sCustomerName,	String sphoneNo, double dbillAmount, double discount){
		super(sCustomerID, sCustomerName, sphoneNo, dbillAmount);
		this.discount=discount;
	}
	
	void computeBillAmount() {
		this.dbillAmount=(this.dbillAmount-this.dbillAmount*0.05);
	}
	
	public String toString() {
		return(sCustomerID + ":" + sCustomerName + ":" + sphoneNo);
	}
	
}

class PrivilegedCustomer extends Customer{
	String memberCardType;
	
	PrivilegedCustomer(String sCustomerID, String sCustomerName, String sphoneNo, double dbillAmount, String memberCardType) {
		super(sCustomerID, sCustomerName, sphoneNo, dbillAmount);
		this.memberCardType=memberCardType;
	}
	
	void computeBillAmount() {
		if(memberCardType.equals("Gold"))
			this.dbillAmount=this.dbillAmount-this.dbillAmount*0.1;
		else if(memberCardType.equalsIgnoreCase("Visa"))
			this.dbillAmount=this.dbillAmount-this.dbillAmount*0.15;
	}
	
	public String toString() {
		return(sCustomerID + ":" + sCustomerName + ":" + sphoneNo);
	}
}

