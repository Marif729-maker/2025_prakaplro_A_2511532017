package Pekan6_2511532017;
import java.util.Random;
import java.util.Scanner;
public class tugasAlproPekan6_2511532017 {

	public static void main(String[] args) {
		Random rand = new Random ();
		Scanner input = new Scanner (System.in);
		int sum = 0;
		String jawab;
		int tries= 0;
		boolean running = true;		
		int counter  = 0;
		while (running) {
			counter++;
			int dadu1 = rand.nextInt(6)+1;
			int dadu2 = rand.nextInt(6)+1;
			sum = dadu1 + dadu2;
			System.out.println(dadu1 + " + " + dadu2 + " = " + sum);
			
			if (sum==7) {
				System.out.println("tebakan anda benar");
				System.out.println("Anda menang setelah "+ counter++ +" percobaan");
				running = false;
				
			}else {
				System.out.println("tebakan anda salah");
				System.out.print("Apakah lanjut (ya/tidak?) ");
				jawab= input.nextLine();
				
				if ( jawab.equalsIgnoreCase("tidak")) {
					running=false;
					System.out.println("anda gagal menang");
			}
			
			
			
		
		}
	} 
}}

