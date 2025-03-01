public class Aksesoris extends PetShop {
    protected String jenis;
    protected String bahan;
    protected String warna;

    public Aksesoris(int id_produk, String nama_produk, int harga_produk, int stok_produk, String jenis, String bahan, String warna) {
        super(id_produk, nama_produk, harga_produk, stok_produk);
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + "\t" + jenis + "\t" + bahan + "\t" + warna;
    }
}
