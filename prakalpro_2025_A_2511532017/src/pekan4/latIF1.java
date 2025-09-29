package pekan4;

import java.util.Scanner;

public class latIF1 {

	public static void main(String[] args) {
		double IPK;
		Scanner input=new Scanner(System.in);
		System.out.println("input IPK anda = ");
		IPK = input.nextDouble();
		input.close();
		if (IPK>2.75) {
			System.out.println("Anda Lulus Sangat Memuaskan dengan IPK "+IPK);
		}
	}

}
