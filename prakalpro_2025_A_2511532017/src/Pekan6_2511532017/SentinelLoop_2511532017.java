package Pekan6_2511532017;

import java.util.Scanner;

public class SentinelLoop_2511532017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner (System.in);
		int sum =0;
		int number= 12; //dummy value , anything but 0
		
		while (number != 0) {
			System.out.print("Masukkan angka (0 untuk keluar) : ");
			number = console.nextInt();
			sum = sum + number;
		}
			System.out.println("totalnya adalah " + sum);
	} 

}
