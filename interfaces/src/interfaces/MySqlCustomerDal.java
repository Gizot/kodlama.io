package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository {
// bir extends sınıfı da olsaydı syntax şu şekilde olurdu
	//class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository
	@Override
	public void add() {
		System.out.println("My sql eklendi");
		
	}

}
