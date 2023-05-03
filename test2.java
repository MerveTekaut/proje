package proje;

import java.util.Scanner;

public class test2 {
//Kilo endeksi
	static Scanner scanner = new Scanner(System.in);
	public static void main (String[]args) {
		
		System.out.print("Kilonuzu giriniz : ");
		int kilo = scanner.nextInt();
		
		System.out.print("Boyunuzu giriniz (örn=1,56): ");
		
		double boy = scanner.nextDouble();
		 
		Double bki = kilo/(boy*boy);
		
		System.out.println("Beden Kitle İndeksiniz : "+bki );
		
		if (bki<18.5) { 
			System.out.print("Zayıf...");	
		}
		
		else if (bki>=18.5 && bki<25) {
			System.out.print("Normal...");
		}
		
		else if ( bki>=25 && bki<30){
			System.out.print("Fazla kilolu...");
		}
		
	   else {
	    
			System.out.print("Obez..." );
		}
		
	}
	

}

