package pekan4;
import java.util.Scanner;
public class tugasAlproPekan4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	
		System.out.println("masukkan Nama : ");
		String nama = input.nextLine();
		
		System.out.println("masukkan berat paket (Kg) : ");
		double beratPaket = input.nextDouble(); //dalam KG
		
		System.out.println("masukkan jarak pengiriman (Km) : ");
		int jarakPengiriman = input.nextInt(); //dalam Km
		
		
		System.out.println("Jenis layanan (1=Reguler, 2=Express, 3=Same Day): ");
		int jenisLayanan = input.nextInt();
		
		
		System.out.println("masukkan jenis paket (1=Dokumen, 2=Barang Biasa, 3=Barang Elektronik) :");
		int jenisPaket = input.nextInt();
		
		//menentukan biaya dasar
		double biayaDasar=0;
		if (beratPaket >10) {
			biayaDasar = 30000;
		}else  {
			biayaDasar = 22500;
		}
		
		
		//menentukan biaya jarak
		double biayaJarak = 0;
		if (jarakPengiriman > 50) {
			biayaJarak = 20000.0;
		}else if (jarakPengiriman >= 25) {
			biayaJarak = 15000.0;
		}else {
			biayaJarak = 10000.0; //jika jarak kurang dari 25 km
		}
		
		//menentukan subtotal 
		double subtotal = biayaDasar + biayaJarak;
		
		//menentukan nama layanan
		String namaLayanan;
		if (jenisLayanan == 3 ) {
			namaLayanan = "Same Day";
		}else if (jenisLayanan == 2 ) {
			namaLayanan = "Express";
		}else if (jenisLayanan == 1 ){
			namaLayanan = "Reguler";
		}else {
			namaLayanan = "jenis layanan tidak ada";
		}
		
		
		//menentukan biaya layanan
		double biayaLayanan = 0;
		int persentase= 0;
		if (jenisLayanan == 3 ) {
			persentase = 80;
			biayaLayanan = 0.8 * subtotal;
		}else if (jenisLayanan == 2 ) {
			persentase = 50;
			biayaLayanan = 0.5 * subtotal;
		}else if (jenisLayanan == 1 ){
			persentase = 20;
			biayaLayanan = 0.2 * subtotal;
		}else {
			System.out.println("jenis layanan tidak ada");
			biayaLayanan = 0.0;
		}
		
		
		//menentukan jenis barang
		String namaPaket;
		if (jenisPaket == 3) {
			namaPaket = "Barang Elektronik";
		}else if (jenisPaket == 2) {
			namaPaket = "Barang Biasa";
		}else if (jenisPaket == 1) {
			namaPaket = "Dokumen";
		}else {
			namaPaket = "nama paket tidak Valid";
		}
		
		//biaya jenis paket
		double biayaJenisPaket = 0;
		if (jenisPaket == 3) {
			biayaJenisPaket = 15000.0;
		}else if (jenisPaket == 2) {
			biayaJenisPaket = 10000.0;
		}else if (jenisPaket == 1) {
			biayaJenisPaket = 5000;
		}else {
			biayaJenisPaket = 0;
		}
		
		//menentukan diskon
		double diskon = 0;
		int diskonPengiriman = 0;
		if (jarakPengiriman > 50) {
			diskon = 0.1;
			diskonPengiriman = 10;
		}else {
			System.out.println("syarat diskon tidak terpenuhi");
			diskon = 0;
		}
		
		double totalBiaya = subtotal + biayaLayanan + biayaJenisPaket ;
		double hadiahDiskon = totalBiaya * diskon;
		double setelahDiskon = totalBiaya -hadiahDiskon;
		//output 
		System.out.println("\n====== BIAYA PENGIRIMAN PAKET ======");
		System.out.println("Nama Pengirim 		: " + nama);
		System.out.println("Berat Paket 		: " + beratPaket + "Kg");
		System.out.println("Jarak Pengiriman 	: " + jarakPengiriman +"Km");
		System.out.println("Jenis Layanan 		: " + namaLayanan);
		System.out.println("Jenis Paket 		: " + namaPaket);
		System.out.println("\n ---------------------------------");
		System.out.println("Biaya Dasar 		: Rp." +(int) biayaDasar);
		System.out.println("Biaya Jarak 		: Rp." +(int) biayaJarak);
		System.out.println("Subtotal   		: Rp." +(int) subtotal );
		System.out.println("Biaya Layanan("+persentase+"%) 	: Rp."+(int) biayaLayanan);
		System.out.println("Total Sebelum Diskon 	: Rp." +(int) totalBiaya);
		System.out.println("Diskon 			: Rp." +(int) hadiahDiskon );
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();
		System.out.println("TOTAL BIAYA 		: Rp." +(int) setelahDiskon);
		
		
		
		
	}

}
