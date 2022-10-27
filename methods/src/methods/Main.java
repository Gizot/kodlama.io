package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	} 

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 9;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			mesajVer("Sayı mevcuttur : " + aranacak);
		} else {
			mesajVer("Sayı mevcut degildir :" + aranacak);
		}

	}
public static void mesajVer(String mesaj) {
	System.out.println(mesaj);
	  
}
	
}
