
public class Main {

	public static void main(String[] args) {
		char grade = 'G';
		
		switch (grade) {
		case 'A':
			System.out.println("Mukemmel : Geçtiniz");
			
			break;
		case 'B':
			System.out.println("Çok Guzel: Geçtiniz");
             break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
		     System.out.println("Fena Degil : Geçtiniz");
		    break;
		case 'F':
		case 'G':	
		      System.out.println("Çok Fena : Kaldınız!");
		     break;
		default:
			System.out.println("Geçersiz not girdiniz!");
			break;
		}

	}

}
