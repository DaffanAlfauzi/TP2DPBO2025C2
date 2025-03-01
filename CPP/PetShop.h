#ifndef PETSHOP_H
#define PETSHOP_H

#include <iostream>
#include <vector>
using namespace std;

class PetShop {
protected:
    int id;
    string nama_produk;
    int harga_produk;
    int stok_produk;

public:
    PetShop(int id, string nama, int harga, int stok) {
        this->id = id;
        this->nama_produk = nama;
        this->harga_produk = harga;
        this->stok_produk = stok;
    }

    virtual void tampilkanData() {
        cout << id << "\t" << nama_produk << "\t" << harga_produk << "\t" << stok_produk;
    }

    virtual ~PetShop() {}
};

class Aksesoris : public PetShop {
protected:
    string jenis, bahan, warna;

public:
    Aksesoris(int id, string nama, int harga, int stok, string jenis, string bahan, string warna)
        : PetShop(id, nama, harga, stok) {
        this->jenis = jenis;
        this->bahan = bahan;
        this->warna = warna;
    }

    void tampilkanData() override {
        PetShop::tampilkanData();
        cout << "\t" << jenis << "\t" << bahan << "\t" << warna;
    }
};

class Baju : public Aksesoris {
private:
    string untuk, size, merk;

public:
    Baju(int id, string nama, int harga, int stok, string jenis, string bahan, string warna, string untuk, string size, string merk)
        : Aksesoris(id, nama, harga, stok, jenis, bahan, warna) {
        this->untuk = untuk;
        this->size = size;
        this->merk = merk;
    }

    void tampilkanData() override {
        Aksesoris::tampilkanData();
        cout << "\t" << untuk << "\t" << size << "\t" << merk << endl;
    }
};

#endif
