package TiketSeni;
// Kelas turunan untuk tiket Festival

class Festival extends Tiket {
    // Constructor
    public Festival() {
        super("Festival", 100);
    }

    // Implementasi method 'hitungHarga' untuk tiket Festival
    @Override
    public int hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}