package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar*1.10; // Eger BaseKrediManager daki hesapla metodunun başına "final" keyword
		//unu eklersek bu metodu extends ledigimiz diger classlarda ezemeyiz.
		// yani override edemeyiz. Bu durum dışındaki her metod overridable dır. 
	}

}
