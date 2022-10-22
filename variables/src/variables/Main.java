package variables;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// deişkenler de camel case yazılır
		//hepsini tek tek elle degiştirmek yerine
		//bir degişken tanımlayıp onu degiştirebiliriz.
		
		int ogrenciSayisi = 12;
		String mesaj = "Ogrenci sayısı : ";
		
	/*
		System.out.println("Ogrenci sayım : 9");
		System.out.println("Ogrenci sayım : 9");
		System.out.println("Ogrenci sayım : 9");
		System.out.println("Ogrenci sayım : 9");
		*/
		System.out.println(mesaj +  ogrenciSayisi);
		System.out.println(mesaj +  ogrenciSayisi);
		System.out.println(mesaj +  ogrenciSayisi);
		System.out.println(mesaj +  ogrenciSayisi);
		//böylelikle tek bir degişiklik yapmak yeterli olacaktır.
	}

}
