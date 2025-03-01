<?php
session_start();
require_once "Baju.php";

$foto_path = "images/" . basename($_FILES["foto_produk"]["name"]);
move_uploaded_file($_FILES["foto_produk"]["tmp_name"], $foto_path);

$newProduct = new Baju(
    count($_SESSION['produk']) + 1,
    $_POST['nama_produk'],
    $_POST['harga_produk'],
    $_POST['stok_produk'],
    $foto_path,
    $_POST['jenis'],
    $_POST['bahan'],
    $_POST['warna'],
    $_POST['untuk'],
    $_POST['size'],
    $_POST['merk']
);

$_SESSION['produk'][] = $newProduct;

header("Location: index.php");
?>
