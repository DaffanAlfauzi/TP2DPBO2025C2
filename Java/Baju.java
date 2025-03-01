public class Baju extends Aksesoris {
    private String untuk;
    private String size;
    private String merk;

    public Baju(int id_produk, String nama_produk, int harga_produk, int stok_produk, String jenis, String bahan, String warna, String untuk, String size, String merk) {
        super(id_produk, nama_produk, harga_produk, stok_produk, jenis, bahan, warna);
        this.untuk = untuk;
        this.size = size;
        this.merk = merk;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + "\t" + untuk + "\t" + size + "\t" + merk;
    }
}
