package youTubeEgıtım;


public class CustomerManager {
	@SuppressWarnings("unused")
	private Customer _customer;
	
	private CrediOprtr _crediOprtr;
	public CustomerManager(Customer customer, CrediOprtr creditManager)
	{
		_customer = customer; // bu işlemin sebebi customer a ait
		//operasyonları farklı operasyonda da çagırabilmek
		//_customer ı ben farklı operasyonlar için de kullanabilirim.
		_crediOprtr = creditManager;
	}

	public void Save() {
		System.out.println("Muşteri kaydedildi : " );
	}

	public void Delete() {
		System.out.println("Muşteri silindi : "  );
	}

	public void GiveCredit() {
		_crediOprtr.Calculate();
		System.out.println("Kredi verildi");
	} 
	
	
	
}
