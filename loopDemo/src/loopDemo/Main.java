package loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		//For
		for (int i=1;i<=10;i+=2) {
			System.out.println(i);
			
		}
		System.out.println("For Döngusu Bitti!");
		
		int i=1;
		//While 
		//infinite loop (sonsuz dönguye girme dikkat et!)
		while(i<10) {
			System.out.println(i);
			i++; // infinite loop'u önlemek için bu sayacın artışını belirtmemiz önemli.
		}
		
		System.out.println("While Döngusu Bitti! ");
		
		//Do-While 
		int j=100;
		do {
			System.out.println(j);
		j+=2;
		} while(j<10); 
		System.out.println("Do-While Döngusu Bitti!");
		
		
	}

}
