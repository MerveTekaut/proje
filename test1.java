package proje;

import java.util.Scanner;

public class test1 {
// Toplam ödenicek tutar
		static Scanner scanner = new Scanner(System.in);
		public static void main (String[]args) {
			
	System.out.print("Aracınız kilometre de kaç kuruş yakıyor (örnek : 0,32) : ");
	double kurus= scanner.nextDouble();
	
	System.out.print("Aracınızla kaç kilometre gittiniz : ");
		int km = scanner.nextInt();

		System.out.print("Toplam ödemeniz gerekn tutar "+kurus*km+" tl dir..");
		}
}


