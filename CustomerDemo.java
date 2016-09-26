package in.ac.kletech.customer;

public class CustomerDemo {

	public static void main(String[] args) {
				Customer[] customers = new Customer[6];
				RegularCustomer regCust1 = new RegularCustomer("1", "aaa", "123", 1000, 0.05);
				PrivilegedCustomer preCust1 = new PrivilegedCustomer("2", "bbb", "124", 2000, "Gold");
				RegularCustomer regCust2 = new RegularCustomer("3", "ccc", "125", 1400, 0.05);
				RegularCustomer regCust3 = new RegularCustomer("4", "ddd", "1256", 3000, 0.05);
				PrivilegedCustomer preCust2 = new PrivilegedCustomer("5", "eee", "1287", 6000, "Visa");
				
				customers[0]=regCust1;
				customers[1]=preCust1;
				customers[2]=regCust2;
				customers[3]=regCust3;
				customers[4]=preCust2;
				
				for(int i=0;i<5;i++)
				{
					System.out.println(customers[i]);
					customers[i].computeBillAmount();
					System.out.println("bill amount = " + customers[i].dbillAmount);
					
				}
				
				customers[5]=regCust1;
				customers[5].computeBillAmount();
				System.out.println("bill amount = " + customers[5].dbillAmount);
				
				
				
			}
		}

