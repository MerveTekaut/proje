package proje;

import java.util.Scanner;

public class test3 {
	//iki sayının değerlerini değiştirme
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
	int birincisayi;
	int ikincisayi;
	
	System.out.print("birinci sayi : ");
	birincisayi= scanner.nextInt();
	
	System.out.print("ikinci sayi : ");
	ikincisayi= scanner.nextInt();
	
	System.out.println("değişim öncesi...");
	System.out.println("birinci sayı : "+birincisayi+" ikinci sayı : "+ikincisayi);
	
	int geçici=birincisayi;
	birincisayi=ikincisayi;
	ikincisayi=geçici;
	System.out.println("değişim sonrası...");
	
	System.out.println("birinci sayı :"+birincisayi+" ikinci sayı : "+ikincisayi);
		
		
	}
}
	
