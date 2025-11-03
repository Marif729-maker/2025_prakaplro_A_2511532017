package Pekan6_2511532017;

import java.util.Scanner;

public class perulanganWhile1_2511532017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		String jawab;
		boolean running = true;
		//deklrasi scanner
		Scanner scan = new Scanner(System.in);
		while (running) {
			counter++;
			System.out.println("Jumlah = "+ counter);
			System.out.print("Apakah lanjut (ya/tidak?) ");
			jawab= scan.nextLine();
			//cek jawab = tidak ,perulangan berhenti
			if ( jawab.equalsIgnoreCase("tidak")) {
				running=false;
			}
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak "+ counter++);
	}

}
