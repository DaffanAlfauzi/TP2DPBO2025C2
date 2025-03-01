import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Baju> dataProduk = new ArrayList<>();

        // Menambahkan 5 objek awal
        dataProduk.add(new Baju(1, "Baju Anjing", 50000, 10, "Pakaian", "Katun", "Merah", "Anjing", "M", "DogWear"));
        dataProduk.add(new Baju(2, "Baju Kucing", 45000, 8, "Pakaian", "Wol", "Biru", "Kucing", "S", "CatStyle"));
        dataProduk.add(new Baju(3, "Kalung Anjing", 30000, 15, "Aksesoris", "Kulit", "Hitam", "-", "-", "-"));
        dataProduk.add(new Baju(4, "Mainan Kucing", 20000, 20, "Mainan", "Plastik", "Kuning", "-", "-", "-"));
        dataProduk.add(new Baju(5, "Sepatu Anjing", 60000, 5, "Pakaian", "Sintetis", "Coklat", "Anjing", "L", "PetShoes"));

        while (true) {
            System.out.println("\n=== MENU PETSHOP ===");
            System.out.println("1. Tampilkan Data Produk");
            System.out.println("2. Tambah Produk Baru");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (pilihan == 1) {
                // Menampilkan tabel data
                System.out.println("\nID\tNama Produk\tHarga\tStok\tJenis\tBahan\tWarna\tUntuk\tSize\tMerk");
                System.out.println("========================================================================================");
                for (Baju item : dataProduk) {
                    System.out.println(item.tampilkanInfo());
                }
            } else if (pilihan == 2) {
                // Menambahkan data baru dari user
                int id_produk = dataProduk.size() + 1;
                System.out.print("Masukkan Nama Produk: ");
                String nama_produk = scanner.nextLine();
                System.out.print("Masukkan Harga Produk: ");
                int harga_produk = scanner.nextInt();
                System.out.print("Masukkan Stok Produk: ");
                int stok_produk = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Masukkan Jenis Produk: ");
                String jenis = scanner.nextLine();
                System.out.print("Masukkan Bahan Produk: ");
                String bahan = scanner.nextLine();
                System.out.print("Masukkan Warna Produk: ");
                String warna = scanner.nextLine();
                System.out.print("Produk untuk (Anjing/Kucing/Tidak ada): ");
                String untuk = scanner.nextLine();
                System.out.print("Masukkan Size (jika ada, jika tidak '-'): ");
                String size = scanner.nextLine();
                System.out.print("Masukkan Merk (jika ada, jika tidak '-'): ");
                String merk = scanner.nextLine();

                dataProduk.add(new Baju(id_produk, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, untuk, size, merk));
                System.out.println("\nProduk berhasil ditambahkan!");
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program...");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}
