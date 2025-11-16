package Pekan7_2511532017;

import java.util.Scanner;

public class tugasAlproPekan7_2511532017 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("===== REGISTER AKUN BARU =====");
		System.out.print("Masukkan Username : ");
		String x = input.nextLine();
		System.out.print("Masukkan Password :");
		String y = input.nextLine();
		System.out.print("Masukkan Email :");
		String z = input.nextLine();
		System.out.print("Masukkan PIN (6 digit) :");
		int o = input.nextInt();
		akun_2511532017 a = new akun_2511532017 ();
		a.setUsername(x);
		a.setPassword(y);
		a.setEmail(z);
		a.setPIN(o);
		a.Cetak();
		int f=10;
		
		System.out.println();
		System.out.println("--- Detail Akun ---");
		System.out.println("Username (lowercase) : " +x.toLowerCase());
		System.out.println("Email (Uppercase) : "+ z.toUpperCase());
		System.out.println("ID pengguna (Gabungan) : "+ x+o );
		System.out.println();
		System.out.println("--- Uji Tipe Data --- (PIN Anda : "+o+" ) ---");
		System.out.println("PIN (int) + 10   ="+( o+f)   );
		System.out.println("PIN (string) + \"10\"  = " + String.valueOf(o) + "10"); // ngubah tipe data int menjadi int

	}

}
