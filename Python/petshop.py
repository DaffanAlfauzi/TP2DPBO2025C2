class PetShop:
    def __init__(self, id_produk, nama_produk, harga_produk, stok_produk):
        self.id_produk = id_produk
        self.nama_produk = nama_produk
        self.harga_produk = harga_produk
        self.stok_produk = stok_produk

    def tampilkan_info(self):
        return f"{self.id_produk}\t{self.nama_produk}\t{self.harga_produk}\t{self.stok_produk}"

class Aksesoris(PetShop):
    def __init__(self, id_produk, nama_produk, harga_produk, stok_produk, jenis, bahan, warna):
        super().__init__(id_produk, nama_produk, harga_produk, stok_produk)
        self.jenis = jenis
        self.bahan = bahan
        self.warna = warna

    def tampilkan_info(self):
        return f"{super().tampilkan_info()}\t{self.jenis}\t{self.bahan}\t{self.warna}"

class Baju(Aksesoris):
    def __init__(self, id_produk, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, untuk, size, merk):
        super().__init__(id_produk, nama_produk, harga_produk, stok_produk, jenis, bahan, warna)
        self.untuk = untuk
        self.size = size
        self.merk = merk

    def tampilkan_info(self):
        return f"{super().tampilkan_info()}\t{self.untuk}\t{self.size}\t{self.merk}"
