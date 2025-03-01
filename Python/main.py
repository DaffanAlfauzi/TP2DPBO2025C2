from petshop import Baju

# List untuk menyimpan data
data_produk = [
    Baju(1, "Baju Anjing", 50000, 10, "Pakaian", "Katun", "Merah", "Anjing", "M", "DogWear"),
    Baju(2, "Baju Kucing", 45000, 8, "Pakaian", "Wol", "Biru", "Kucing", "S", "CatStyle"),
    Baju(3, "Kalung Anjing", 30000, 15, "Aksesoris", "Kulit", "Hitam", "-", "-", "-"),
    Baju(4, "Mainan Kucing", 20000, 20, "Mainan", "Plastik", "Kuning", "-", "-", "-"),
    Baju(5, "Sepatu Anjing", 60000, 5, "Pakaian", "Sintetis", "Coklat", "Anjing", "L", "PetShoes")
]

# Fungsi untuk menampilkan tabel data
def tampilkan_data():
    print("\nID\tNama Produk\tHarga\tStok\tJenis\tBahan\tWarna\tUntuk\tSize\tMerk")
    print("="*90)
    for item in data_produk:
        print(item.tampilkan_info())

# Fungsi untuk menambahkan data baru
def tambah_data():
    id_produk = len(data_produk) + 1
    nama_produk = input("Masukkan Nama Produk: ")
    harga_produk = int(input("Masukkan Harga Produk: "))
    stok_produk = int(input("Masukkan Stok Produk: "))
    jenis = input("Masukkan Jenis Produk: ")
    bahan = input("Masukkan Bahan Produk: ")
    warna = input("Masukkan Warna Produk: ")
    untuk = input("Produk untuk (Anjing/Kucing/Tidak ada): ")
    size = input("Masukkan Size (jika ada, jika tidak '-'): ")
    merk = input("Masukkan Merk (jika ada, jika tidak '-'): ")

    produk_baru = Baju(id_produk, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, untuk, size, merk)
    data_produk.append(produk_baru)
    print("\nProduk berhasil ditambahkan!")

# Main program
while True:
    print("\n=== MENU PETSHOP ===")
    print("1. Tampilkan Data Produk")
    print("2. Tambah Produk Baru")
    print("3. Keluar")
    
    pilihan = input("Pilih Menu: ")
    
    if pilihan == "1":
        tampilkan_data()
    elif pilihan == "2":
        tambah_data()
    elif pilihan == "3":
        print("Keluar dari program...")
        break
    else:
        print("Pilihan tidak valid!")
