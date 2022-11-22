package interfaces;

public class CustomerManager {
	ICustomerDal customerDal;
	public void add() {
		// burada iş kodları yazılır.
		//OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
		//yukarıdaki kodu yazarsangeçmiş olsun artık baımlısın hep oracle ile çalışmak zorundasın bunun yerine 
	// public void add() den önce ICustomerDal customerDal; diyebiliriz.
	
		customerDal.add();
		//CustomerManager ın customerDal ı var ve biz onun add ini çagıracagız demek
	
	
	}

}
