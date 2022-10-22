package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String ogrenci1="Tsunade";
		String ogrenci2="Itachi";
		String ogrenci3="Jiraia";
		String ogrenci4="Tobi";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("--------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Tsunade";
		ogrenciler[1]="Itachi";
		ogrenciler[2]="Jiraia";
		ogrenciler[3]="Tobi";
		//ogrenciler[4]="Kakashi";
		for(int i=0; i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("**********************");
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
