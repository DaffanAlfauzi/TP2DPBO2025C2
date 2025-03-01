public class PetShop {
    protected int id_produk;
    protected String nama_produk;
    protected int harga_produk;
    protected int stok_produk;

    public PetShop(int id_produk, String nama_produk, int harga_produk, int stok_produk) {
        this.id_produk = id_produk;
        this.nama_produk = nama_produk;
        this.harga_produk = harga_produk;
        this.stok_produk = stok_produk;
    }

    public String tampilkanInfo() {
        return id_produk + "\t" + nama_produk + "\t" + harga_produk + "\t" + stok_produk;
    }
}
