package TiketSeni;

// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    protected String jenis;
    protected int harga;

    // Constructor
    public Tiket(String jenis, int harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    // Abstract method untuk menghitung harga dengan diskon
    public abstract int hitungHarga(int jumlah);

    // Method untuk menampilkan nota sesuai dengan pemesanan
    public void tampilkanNota(String nama, String tahap, int jumlah, double totalHarga) {
        System.out.println("\n--- Nota Pemesanan ---");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Tahap Pembelian: " + tahap);
        System.out.println("Jenis Tiket: " + jenis);
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}
