package oop1;

public class Main {

	public static void main(String[] args) {
    
		Product product1= new Product();
		product1.setName("Delonghi Kahve Makinesý");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesý");
		product2.setDiscount(6);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2.jpg");
		
				
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(5);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(1);
		product3.setImageUrl("image3.jpg");
	
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
			IndividualCustomer individualCustomer = new IndividualCustomer();
			individualCustomer.setId(1);
			individualCustomer.setPhone("0511112211");
			individualCustomer.setCustomerNumber("12345");
			individualCustomer.setFirstName("Gizo");
			individualCustomer.setLastName("Demeter");
			
			CorporateCustomer corporateCustomer = new CorporateCustomer();
			corporateCustomer.setId(2);
			corporateCustomer.setCompanyName("Tastanholding");
			corporateCustomer.setPhone("0522222222");
			corporateCustomer.setTaxNumber("11111111111");
	        corporateCustomer.setCustomerNumber("5421");
	        
	        Customer[] customers = {individualCustomer,corporateCustomer};
	
	        for (Customer customer : customers) {
				System.out.println(customer.getCustomerNumber());
			}
	
	}
	
	
		
	}


