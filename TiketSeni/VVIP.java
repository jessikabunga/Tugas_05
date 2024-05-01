package TiketSeni;

// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    // Constructor
    public VVIP() {
        super("VVIP", 200);
    }

    // Implementasi method 'hitungHarga' untuk tiket VVIP dengan presale
    @Override
    public int hitungHarga(int jumlah) {
        return (int) (harga * jumlah * 0.8); // Diskon 20%
    }
}