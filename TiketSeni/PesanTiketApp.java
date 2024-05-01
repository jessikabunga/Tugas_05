package TiketSeni;

/*
    Jessika Bunga Amalia
    235150701111005
    TI - A
 */

import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();

        System.out.println("\nPilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        int pilihanTahap = scanner.nextInt();

        Tiket tiket = null; // Mendeklarasikan bahwa variable 'tiket' memiliki nilai null

        // Memeriksa jawaban yang telah dimasukkan oleh user
        if (pilihanTahap == 1) {
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
            int pilihanTiket = scanner.nextInt();

            // Jawaban user kembali diperiksa dan akan diarahkan ke kelas yang sesuai dengan pilihan
            if (pilihanTiket == 1) {
                tiket = new VIP();
            } else if (pilihanTiket == 2) {
                tiket = new VVIP();
            } else {
                System.out.println("Pilihan tidak valid.");
                return;
            }
        } else if (pilihanTahap == 2) {
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Masukkan pilihan (1/2/3): ");
            int pilihanTiket = scanner.nextInt();

            // Menentukan jenis tiket yang telah dipilih oleh user
            switch (pilihanTiket) {
                case 1:
                    tiket = new Festival();
                    break;
                case 2:
                    tiket = new VIP();
                    break;
                case 3:
                    tiket = new VVIP();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    return;
            }
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = scanner.nextInt();

        // Membuat objek 'Pemesanan' yang digunakan untuk memanggil method 'cetakNota()'
        Pemesanan pemesanan = new Pemesanan(nama, (pilihanTahap == 1 ? "Presale" : "Reguler"), tiket, jumlahTiket);
        pemesanan.cetakNota();

        scanner.close();
        
    }
}