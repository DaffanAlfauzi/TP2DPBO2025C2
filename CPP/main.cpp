#include <iostream>
#include <vector>
#include "PetShop.h"

using namespace std;

vector<Baju> daftarProduk;

void tampilkanTabel() {
    cout << "ID\tNama\tHarga\tStok\tJenis\tBahan\tWarna\tUntuk\tSize\tMerk\n";
    for (Baju &b : daftarProduk) {
        b.tampilkanData();
    }
}

void tambahProduk() {
    int id, harga, stok;
    string nama, jenis, bahan, warna, untuk, size, merk;

    cout << "Masukkan ID: ";
    cin >> id;
    cin.ignore(); // Menghindari masalah buffer input

    cout << "Masukkan Nama Produk: ";
    getline(cin, nama); // Menggunakan getline untuk menangkap input dengan spasi

    cout << "Masukkan Harga: ";
    cin >> harga;
    cout << "Masukkan Stok: ";
    cin >> stok;
    cin.ignore(); // Hindari buffer input sebelum string berikutnya

    cout << "Masukkan Jenis: ";
    getline(cin, jenis);

    cout << "Masukkan Bahan: ";
    getline(cin, bahan);

    cout << "Masukkan Warna: ";
    getline(cin, warna);

    cout << "Masukkan Untuk (Pria/Wanita): ";
    getline(cin, untuk);

    cout << "Masukkan Size: ";
    getline(cin, size);

    cout << "Masukkan Merk: ";
    getline(cin, merk);

    daftarProduk.push_back(Baju(id, nama, harga, stok, jenis, bahan, warna, untuk, size, merk));

    cout << "Produk berhasil ditambahkan!\n";
}


int main() {
    // Menambahkan 5 objek awal
    daftarProduk.push_back(Baju(1, "Kerah Anjing", 50000, 10, "Aksesoris", "Kulit", "Hitam", "Anjing", "L", "Doggo"));
    daftarProduk.push_back(Baju(2, "Baju Kucing", 75000, 8, "Aksesoris", "Katun", "Merah", "Kucing", "M", "MeowWear"));
    daftarProduk.push_back(Baju(3, "Mainan Anjing", 30000, 15, "Mainan", "Plastik", "Biru", "Anjing", "S", "PawFun"));
    daftarProduk.push_back(Baju(4, "Leash Kucing", 60000, 12, "Aksesoris", "Nylon", "Hijau", "Kucing", "M", "CatSafe"));
    daftarProduk.push_back(Baju(5, "Topi Anjing", 45000, 9, "Aksesoris", "Wool", "Coklat", "Anjing", "L", "PuppyCap"));

    int pilihan;
    while (true) {
        cout << "\nMenu:\n1. Tampilkan Produk\n2. Tambah Produk\n3. Keluar\nPilih: ";
        cin >> pilihan;

        if (pilihan == 1) {
            tampilkanTabel();
        } else if (pilihan == 2) {
            tambahProduk();
        } else if (pilihan == 3) {
            break;
        } else {
            cout << "Pilihan tidak valid.\n";
        }
    }

    return 0;
}
