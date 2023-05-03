package proje;

import java.util.Scanner;

public class test4 {
	//Hipotenüs bulma
	static Scanner scanner = new Scanner(System.in);
	public static void main (String[]args) {
		
	int a;
	int b ;
		
	System.out.print("Birinci kenar : ");
	a = scanner.nextInt();
	System.out.print("İkinci kenar : ");
	b = scanner.nextInt();
	
	double h = Math.sqrt(a*a+b*b);
	System.out.print("Hipotenüs : "+h);
	
	}
}
