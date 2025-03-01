<?php
class PetShop {
    protected $id_produk;
    protected $nama_produk;
    protected $harga_produk;
    protected $stok_produk;
    protected $foto_produk;

    public function __construct($id_produk, $nama_produk, $harga_produk, $stok_produk, $foto_produk) {
        $this->id_produk = $id_produk;
        $this->nama_produk = $nama_produk;
        $this->harga_produk = $harga_produk;
        $this->stok_produk = $stok_produk;
        $this->foto_produk = $foto_produk;
    }

    public function getInfo() {
        return [$this->id_produk, $this->nama_produk, $this->harga_produk, $this->stok_produk, $this->foto_produk];
    }
}
?>
