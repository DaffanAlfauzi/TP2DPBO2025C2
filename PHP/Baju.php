<?php
require_once "Aksesoris.php";

class Baju extends Aksesoris {
    private $untuk;
    private $size;
    private $merk;

    public function __construct($id_produk, $nama_produk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna, $untuk, $size, $merk) {
        parent::__construct($id_produk, $nama_produk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna);
        $this->untuk = $untuk;
        $this->size = $size;
        $this->merk = $merk;
    }

    public function getInfo() {
        return array_merge(parent::getInfo(), [$this->untuk, $this->size, $this->merk]);
    }
}
?>
