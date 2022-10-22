
public class Main {

	public static void main(String[] args) {
// 6-->1,2,3 e bölnr ve bunların (kendi hariç)toplamı 6 yı verir
		// böyle sayılara mukemmel sayı denir.
		//örn;28 de mukemmel sayıdır.
		//28-->1,2,4,7,14
		
		int number = 29 ;
		int total = 0;
		for(int i=1;i<number;i++) {
			if(number % i == 0)
				total = total +i;
			
		}
		
		if(total == number) {
			System.out.println("Mukemmel sayıdır.");
			
		}
		else {
			System.out.println("Mukemmel sayı degildir.");
		}
	}

}
