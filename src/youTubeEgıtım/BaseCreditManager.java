package youTubeEgıtım;

public abstract class BaseCreditManager implements CrediOprtr  {
	public abstract void Calculate(); //heryerde deişken calculate fonk.u böyle tutulur
	public void Save() { //heryerde aynı olan Save fonk. u direk verilir.
		System.out.println("Kaydedildi");
	}

	
}
