<?php
require_once "Baju.php";

session_start();

if (!isset($_SESSION['produk'])) {
    $_SESSION['produk'] = [
        new Baju(1, "Baju Anjing", 50000, 10, "images/baju_anjing.jpg", "Pakaian", "Katun", "Merah", "Anjing", "M", "DogWear"),
        new Baju(2, "Baju Kucing", 45000, 8, "images/baju_kucing.jpg", "Pakaian", "Wol", "Biru", "Kucing", "S", "CatStyle"),
        new Baju(3, "Kalung Anjing", 30000, 15, "images/kalung_anjing.jpg", "Aksesoris", "Kulit", "Hitam", "-", "-", "-"),
        new Baju(4, "Mainan Kucing", 20000, 20, "images/mainan_kucing.jpg", "Mainan", "Plastik", "Kuning", "-", "-", "-"),
        new Baju(5, "Sepatu Anjing", 60000, 5, "images/sepatu_anjing.jpg", "Pakaian", "Sintetis", "Coklat", "Anjing", "L", "PetShoes"),
    ];
}

echo "<h2>Daftar Produk PetShop</h2>";
echo "<table border='1'><tr><th>ID</th><th>Nama</th><th>Harga</th><th>Stok</th><th>Foto</th><th>Jenis</th><th>Bahan</th><th>Warna</th><th>Untuk</th><th>Size</th><th>Merk</th></tr>";

foreach ($_SESSION['produk'] as $p) {
    $info = $p->getInfo();
    echo "<tr><td>{$info[0]}</td><td>{$info[1]}</td><td>{$info[2]}</td><td>{$info[3]}</td>
          <td><img src='{$info[4]}' width='100'></td><td>{$info[5]}</td><td>{$info[6]}</td><td>{$info[7]}</td>
          <td>{$info[8]}</td><td>{$info[9]}</td><td>{$info[10]}</td></tr>";
}

echo "</table><br><a href='tambah.php'>Tambah Produk</a>";
?>
