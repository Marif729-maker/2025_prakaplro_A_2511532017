package pekan2;

public class tugasAlproPekan2 {

    public static void main(String[] args) {

        // int: waktu lari dalam detik & jarak dalam meter
        int waktuDetik = 1500;   
        int jarakMeter = 10000; 

        // float: untuk perhitungan pace (menit per km)
        float waktuMenit = waktuDetik / 60.0f;     // konversi detik ke menit
        float jarakKm = jarakMeter / 1000.0f;      // konversi meter ke km
        float pace = waktuMenit / jarakKm;         // pace = menit per km

        // char: simbol kualitas lari berdasarkan pace
        char kualitasLari;

        // boolean: apakah lari efisien? (pace <= 5.0 menit/km = cepat)
        boolean lariEfisien = pace <= 5.0f;

        // Tentukan kualitas lari
        if (pace <= 4.5f) {
            kualitasLari = 'A'; // LARI CEPAT
        } else if (pace <= 5.5f) {
            kualitasLari = 'B'; // LARI LUMAYAN CEPAT
        } else {
            kualitasLari = 'C'; // LARI LAMBAT
        }

        System.out.println("===== HASIL PACE =====");
        System.out.printf(" Waktu lari:"+ waktuMenit + "menit" );
        System.out.println();
        System.out.printf(" Jarak tempuh:"+ jarakKm + "km");
        System.out.println();
        System.out.printf(" Pace Anda:"+ pace);
        System.out.println();
        System.out.println(" Kualitas lari: " + kualitasLari);
        System.out.println();
        System.out.println(" Lari efisien? " + (lariEfisien ? "WADAWW..IYAA!" : "WAHAHAHA..MASIH BELUM"));
        System.out.println("=================================");
    }
}