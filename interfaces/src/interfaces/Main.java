package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		// Interface ler birer referans tutucudur, unutma.
		customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();
		
		
		
	}

}
