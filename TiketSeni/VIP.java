package TiketSeni;
// Kelas turunan untuk tiket VIP

class VIP extends Tiket {
    // Constructor
    public VIP() {
        super("VIP", 150);
    }

    // Implementasi method 'hitungHarga' untuk tiket VIP dengan presale
    @Override
    public int hitungHarga(int jumlah) {
        return (int) (harga * jumlah * 0.8); // Diskon 20%
    }
 }