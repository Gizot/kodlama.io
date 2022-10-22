package strings;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		String mesaj = "  Bugun hava çok soguk.    ";
		System.out.println(mesaj);
		/*
		 * System.out.println("Eleman sayısı : " + mesaj.length());
		 * System.out.println("5. eleman : " + mesaj.charAt(4));
		 * System.out.println(mesaj.concat("Yaşasın!"));
		 * System.out.println(mesaj.startsWith("b"));
		 * System.out.println(mesaj.endsWith(".")); char[] karakterler = new char[5];
		 * mesaj.getChars(0, 5, karakterler, 0); // getChars'ta 4 dersen onu dahil etmez
		 * // o yzden buraya 4 yerine 5 deeri verdik ki 4. elemanı da yazsın dedik //
		 * ama ben yazınca anladım ki dahil ediyor. System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf("av"));// a yerine "av" diyip bir metin de
		 * arayabiliriz System.out.println(mesaj.lastIndexOf("a")); // bu defa çift
		 * tırnak (") koyduk!
		 */
		
		String yeniMesaj = mesaj.replace(' ','_');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,4));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
		
	}

}
