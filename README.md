TP2DPBO2025C2

Janji

Saya Daffan Alfauzi Nurrobby dengan NIM 2007591 mengerjakan Tugas Praktikum 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

Penjelasan Atribut dan Methods

1. Class PetShop (Base Class)

Atribut:

id: int → ID unik untuk setiap produk

nama_produk: string → Nama produk di pet shop

harga_produk: float → Harga produk

stok_produk: int → Jumlah stok tersedia

foto_produk: string (khusus PHP) → Path gambar produk

Methods:

PetShop(id, nama_produk, harga_produk, stok_produk, foto_produk): Constructor untuk inisialisasi objek

getId(): Mengembalikan ID produk

getNamaProduk(): Mengembalikan nama produk

getHargaProduk(): Mengembalikan harga produk

getStokProduk(): Mengembalikan stok produk

getFotoProduk(): Mengembalikan path foto produk (khusus PHP)

tampilkanData(): Menampilkan informasi produk

2. Class Aksesoris (Child dari PetShop)

Atribut:

jenis: string → Jenis aksesoris (contoh: kalung, mainan)

bahan: string → Bahan aksesoris (contoh: kain, plastik)

warna: string → Warna aksesoris

Methods:

Aksesoris(id, nama_produk, harga_produk, stok_produk, foto_produk, jenis, bahan, warna): Constructor untuk inisialisasi objek aksesoris

getJenis(): Mengembalikan jenis aksesoris

getBahan(): Mengembalikan bahan aksesoris

getWarna(): Mengembalikan warna aksesoris

tampilkanData(): Override method tampilkanData() untuk menampilkan informasi lengkap

3. Class Baju (Child dari Aksesoris)

Atribut:

untuk: string → Target pengguna baju (misal: anjing, kucing)

size: string → Ukuran baju (S, M, L, XL)

merk: string → Merk baju

Methods:

Baju(id, nama_produk, harga_produk, stok_produk, foto_produk, jenis, bahan, warna, untuk, size, merk): Constructor untuk inisialisasi objek baju

getUntuk(): Mengembalikan target pengguna

getSize(): Mengembalikan ukuran baju

getMerk(): Mengembalikan merk baju

tampilkanData(): Override method tampilkanData() untuk menampilkan informasi lengkap

Penjelasan Alur Program

Inisialisasi 5 Data Awal

Program dimulai dengan membuat 5 objek awal untuk setiap bahasa pemrograman.

Data awal mencakup 3 kategori: PetShop, Aksesoris, dan Baju.

Menampilkan Data Produk dalam Tabel

Semua data produk ditampilkan dalam bentuk tabel dinamis.

Tabel akan menampilkan atribut dari setiap class, termasuk data dari class parent.

Khusus PHP, gambar produk juga ditampilkan dalam tabel.

Menambahkan Data Baru

Program menerima input dari user untuk menambahkan produk baru.

Data baru akan dimasukkan ke dalam list dan kembali ditampilkan di tabel.

Penggunaan Inheritance

Baju mewarisi Aksesoris, dan Aksesoris mewarisi PetShop.

Saat tampilkanData() dipanggil, data dari semua parent class juga ditampilkan.

File input.txt

File ini berisi contoh test case input yang bisa digunakan untuk menguji program.

Setiap bahasa (C++, Python, Java, PHP) memiliki versi test case masing-masing.

Cara Menjalankan Program

C++

cd CPP
g++ -o main PetShop.cpp main.cpp
./main

Python

cd Python
python3 main.py

Java

cd Java
javac *.java
java Main

PHP

Pastikan kamu sudah mengaktifkan server lokal dengan XAMPP atau PHP Built-in Server.

Jalankan dengan:

cd PHP
php -S localhost:8000

Buka browser dan akses: http://localhost:8000/index.php

Dokumentasi Output

(Tambahkan screenshot tampilan output dari setiap bahasa di sini)

Design Diagram UML

(Tambahkan gambar UML class diagram di sini)

