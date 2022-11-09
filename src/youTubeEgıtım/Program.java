package youTubeEgıtım;

public class Program {

	public static void main(String[] args) {
		
	/*	System.out.println("Hello world!");

		int sayi1=10;	//deger tipi																																																																																											
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		
		System.out.println(sayi1); 
		
		int[] sayilar1 = new int[] {1, 2, 3}; //Referans tipi degişken
		int [] sayilar2 = new int[] {10 , 20 , 30};
		sayilar1=sayilar2;
		sayilar2[0] = 1000; 
		
		System.out.println(sayilar1[0]); 
		
		CreditManager creditmanager = new CreditManager(); 
		creditmanager.Calculate();
		creditmanager.Calculate();
		creditmanager.Save();
		
		Customer customer = new Customer (); // ÖRNEGİNİ OLUŞTURMAK, INSTANCE (creation) OLUŞTURMAK
		customer.Id=1;
		
		
		customer.City="Ankara";
		System.out.println(customer.getCity());
	
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
					System.out.println();
					
		Company company = new Company();
		company.CompanyName="Konoha";
		company.TaxNumber="100000";
		company.Id=1122;
		
		CustomerManager customerManager2=new CustomerManager(new Person());
		 
		
		
		Person person = new Person();
		person.Firstname="Tsunade";
		person.NationalIdendity="1254645";
		
		Customer c1=new Customer();
		Customer c2=new Person();
		Customer c3=new Company();
		
		
		
	} 
	*/
		//IoC container
		
	CustomerManager customerManager = new CustomerManager (new Customer(), new 		TeacherCreditManager());
	customerManager.GiveCredit();
	System.out.println();
	    
	}
	}
	    


