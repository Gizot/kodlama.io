package datatypes;

public class Main {

	public static void main( String[] args) {
		/*
		 * boolean: true or false 1 byte
		 * char : single character(unicode)   2 bytes all unicode characters
		 * byte : integer 1 byte -128 to 127
		 * short: integer 2 bytes -32768 to 32767
		 * int  : integer 4 bytes -2147483648 to 2147483647
		 * long : integer 8 bytes 
		 * float: floating-point number 4 bytes
		 * double: floating-point number 8 bytes
		 */
		double sayi = 12.5;
		int a = 127;
		
		char karakter ='A'; //ASCII TABLE
		char x = 68; // 68 ascii tablosunda "D" imiş.
		boolean dogruMu= false;
		System.out.println(sayi);
		System.out.println(a);
	    System.out.println(karakter);
	    System.out.println(dogruMu);
	    System.out.println(x);
	}
	
}
