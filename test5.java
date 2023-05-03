package proje;

import java.util.Scanner;

public class test5 {
	// maksimum olan sayıyı bulma 
	static Scanner scanner = new Scanner(System.in);
	public static void main (String[]args) {
		
		Scanner Scanner = new Scanner(System.in) ;
		
		System.out.print("Birinci sayıyı giriniz : ");
		int a = scanner.nextInt();
		System.out.print("İkinci sayıyı giriniz : ");
		int b = scanner.nextInt();
		System.out.print("Üçüncü sayıyı giriniz : ");
		int c = scanner.nextInt();
	
		int max = -1;
		
		if ( a >= b  &&  a >= c ) {
			max = a;
		}
		
		else if (b >= c && b >= c ) {
		max= b ;
		
		}
		
		else {
			
			max = c ;
			
		}
		
		System.out.print("Maksimum sayı : " +max);
		
	}
}
	
	
