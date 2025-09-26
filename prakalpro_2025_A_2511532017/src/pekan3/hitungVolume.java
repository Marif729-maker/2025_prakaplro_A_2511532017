package pekan3;

import java.util.Scanner;

public class hitungVolume {

	public static void main(String[] args) {
		//menghitung volume kerucut
		double r;
		double t;
		final double PI=3.14;
		double V;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Input jari-jari : ");
		r = keyboard.nextDouble ();
		System.out.println("input tinggi :");
		t = keyboard.nextDouble();
		keyboard.close ();
		System.out.println("volume kerucut adalah = ");
		V = (1.0/3.0) * Math.PI *r * r * t;
		System.out.println("volume kerucut adalah = " + V);

	}

}
