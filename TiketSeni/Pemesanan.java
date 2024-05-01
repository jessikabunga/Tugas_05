package TiketSeni;

// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    // Method untuk mencetak nota
    public void cetakNota() {
        double totalHarga = tiket.hitungHarga(jumlah); // Menghitung total harga tiket
        // Untuk memanggil method 'tampilkanNota' pada kelas tiket
        tiket.tampilkanNota(nama, tahap, jumlah, totalHarga);
    }
}